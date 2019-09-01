package cn.itcast.demo08.reverse_stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo02InputStreamReader {
    public static void main(String[] args) throws IOException {
        //read_utf_8();
        read_gbk();
    }

    private static void read_gbk() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day26-io-property//gbk.txt"),"GBK");
        int len = 0;
        while((len=isr.read())!=-1) {
            System.out.println((char)len);
        }
        isr.close();
    }

    private static void read_utf_8() throws IOException {
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day26-io-property//utf_8.txt"));
        int len = 0;
        while((len=isr.read())!=-1) {
            System.out.println((char)len);
        }
        isr.close();
    }
}
