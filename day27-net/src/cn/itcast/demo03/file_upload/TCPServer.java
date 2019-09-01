package cn.itcast.demo03.file_upload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        // create a server socket;
        ServerSocket server = new ServerSocket(8888);
        // create  a folder (target folder);
        File file = new File("C:\\Users\\xinla\\Desktop\\Pictures");
        if (file.exists()) {
            file.mkdir();
        }

        while (true) {
            // acquire
            Socket socket = server.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        // local output stream used to copy the file
                        String fileName = "itcast" +System.currentTimeMillis()+ new Random().nextInt(999999)+".jpg";
                        FileOutputStream fos = new FileOutputStream(file + "\\"+fileName);
                        // socket input stream
                        InputStream is = socket.getInputStream();

                        byte[] bytes = new byte[1024];
                        int len = 0;
                        while ((len = is.read(bytes)) != -1) {
                            fos.write(bytes);
                        }

                        System.out.println("The upload is successful.");

                        socket.getOutputStream().write("The upload is done.".getBytes());
                        fos.close();
                        socket.close();
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }
            }).start();
        }

    }
}
