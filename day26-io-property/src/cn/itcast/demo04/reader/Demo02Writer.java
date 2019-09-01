package cn.itcast.demo04.reader;

import java.io.FileWriter;
import java.io.IOException;

public class Demo02Writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("day26-io-property//d.txt",true);
        for (int i = 0; i < 10; i++) {
            fw.write("Hello World!" + "\r\n");
        }

        fw.write(97);
        fw.close();
    }
}