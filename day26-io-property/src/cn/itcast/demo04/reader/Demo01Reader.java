package cn.itcast.demo04.reader;


import java.io.FileReader;
import java.io.IOException;

public class Demo01Reader {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("day26-io-property//c.txt");

        int len = 0;
        char[] chars = new char[1024];
        while ((len = fr.read(chars)) !=-1) {
            System.out.println(new String(chars));
        }
        fr.close();
    }
}
