package cn.itcast.demo01.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {

        // Step 1: create a server socket
        ServerSocket ss = new ServerSocket(8888);

        // Step 2: accept the request;
        Socket cs = ss.accept();

        // Step 3: Input stream;
        InputStream inputStream = cs.getInputStream();

        // Step 4: receive the bytes;
        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);

        System.out.println(new String(bytes,0,len));

        // Step 5: send back a message
        OutputStream outputStream = cs.getOutputStream();
        outputStream.write("Fine. Thank you. The request has been received.".getBytes());

        // Step 6: release the RAM
        cs.close();
        ss.close();


    }
}
