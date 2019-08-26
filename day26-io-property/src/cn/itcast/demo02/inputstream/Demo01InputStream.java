package cn.itcast.demo02.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day26-io-property//a.txt");
        /*int read = fis.read();
        System.out.println(read);
        int read1 = fis.read();
        System.out.println(read1);
        int read2 = fis.read();
        System.out.println(read2);*/
        int b = 0;
        while ((b = fis.read()) !=-1) {
            System.out.println((char) b);
        }
        fis.close();
    }
}
