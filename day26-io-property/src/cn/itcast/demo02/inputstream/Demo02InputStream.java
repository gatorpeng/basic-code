package cn.itcast.demo02.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo02InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day26-io-property//b.txt");
        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = fis.read(bytes))!=-1) {
            System.out.println(new String(bytes,0,len));
        }
    }
}
