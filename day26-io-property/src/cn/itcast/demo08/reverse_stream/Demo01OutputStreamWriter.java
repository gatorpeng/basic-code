package cn.itcast.demo08.reverse_stream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Demo01OutputStreamWriter {
    public static void main(String[] args) throws IOException {
        //write_utf_8();
        write_gbk();
    }

    private static void write_gbk() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day26-io-property//gbk.txt"),"gbk");
        osw.write("你好");
        osw.close();
    }

    private static void write_utf_8() throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day26-io-property//utf_8.txt"),"utf-8");
        osw.write("你好");
        osw.close();

    }
}
