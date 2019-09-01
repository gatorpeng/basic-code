package cn.itcast.demo02.file_upload;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        // create a server socket;
        ServerSocket server = new ServerSocket(8888);
        // acquire
        Socket socket = server.accept();
        //
        File file = new File("C:\\Users\\xinla\\Desktop\\Pictures");

        FileOutputStream fos = new FileOutputStream(file + "\\1.jpg");

        if (file.exists()) {
            file.mkdir();
        }
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
        server.close();
    }
}
