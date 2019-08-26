package cn.itcast.demo01.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01OutputStream {
    public static void main(String[] args) throws IOException {
        byte[] bytes = {65,67,68,69};

        FileOutputStream fos = new FileOutputStream("day26-stream-and-method\\a.txt");
        fos.write(97);

        fos.write(49);
        fos.write(48);

        fos.write(bytes);

        fos.write(bytes,1,2);
        fos.close();

    }
}
