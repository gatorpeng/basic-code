package cn.itcast.demo01.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        // Step 1: create a socket class for the client
        Socket sc = new Socket("127.0.0.1",8888);

        // Step 2: output stream
        OutputStream os = sc.getOutputStream();

        // Step 3: send data
        os.write("Hello, how are you doing?".getBytes());

        // Step 4: input stream

        InputStream inputStream = sc.getInputStream();

        byte[] bytes = new byte[1024];
        int len = inputStream.read(bytes);

        //Step 5: print
        System.out.println(new String(bytes,0,len));

        //Step 6: close the socket;
        sc.close();

    }
}
