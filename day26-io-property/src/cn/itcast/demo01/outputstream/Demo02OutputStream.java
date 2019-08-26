package cn.itcast.demo01.outputstream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo02OutputStream {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("day26-stream-and-method\\b.txt",true);
        for (int i = 0; i < 10; i++) {
            fos.write("awesome".getBytes());
            fos.write("\r\n".getBytes());
        }
        fos.close();

        StringBuilder sb = new StringBuilder();


    }
}
