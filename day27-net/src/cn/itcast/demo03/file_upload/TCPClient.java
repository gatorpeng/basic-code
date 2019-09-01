package cn.itcast.demo03.file_upload;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {

        // local input stream (read local file)
        FileInputStream fis = new FileInputStream("C:\\1.jpg");
        // create a net socket
        Socket socket = new Socket("127.0.0.1", 8888);
        // net output stream which is used to send data
        OutputStream os = socket.getOutputStream();

        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes)) != -1) {
            os.write(bytes);
        }
        socket.shutdownOutput();

        // net input stream which is used to receive data;

        while ((len = socket.getInputStream().read(bytes)) != -1) {
            System.out.println(new String(bytes, 0, len));
        }

        fis.close();
        socket.close();
    }
}
