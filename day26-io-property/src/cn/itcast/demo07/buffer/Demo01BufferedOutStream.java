package cn.itcast.demo07.buffer;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo01BufferedOutStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("day26-io-property//d.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        for (int i = 0; i < 10; i++) {
            bos.write("Hello World".getBytes());
            bos.write("\r\n".getBytes());

        }

        bos.close();

    }
}
