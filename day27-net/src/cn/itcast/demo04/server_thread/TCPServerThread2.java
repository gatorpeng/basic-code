package cn.itcast.demo04.server_thread;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerThread2 {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8080);

        while (true) {
            Socket socket = server.accept();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream is = socket.getInputStream();

                        BufferedReader br = new BufferedReader(new InputStreamReader(is));
                        String line = br.readLine();
                        String[] arr = line.split(" ");
                        String htmlPath = arr[1].substring(1);

                        FileInputStream fis = new FileInputStream(htmlPath);
                        OutputStream os = socket.getOutputStream();

                        os.write("HTTP/1.1 200 OK\r\n".getBytes());
                        os.write("Content-Type:text/html\r\n".getBytes());
                        os.write("\r\n".getBytes());

                        byte[] bytes = new byte[1024];
                        int len = 0;
                        while ((len=fis.read(bytes))!=-1) {
                            os.write(bytes,0,len);
                        }

                        fis.close();
                        socket.close();
                    }catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

        }

//        server.close();

    }
}
