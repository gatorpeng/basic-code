package cn.itcast.demo08.reverse_stream;

import java.io.*;

public class Demo03Practice {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("day26-io-property//utf_802.txt"));
        InputStreamReader isr = new InputStreamReader(new FileInputStream("day26-io-property//gbk.txt"),"gbk");

        int len = 0;
        while((len=isr.read())!=-1) {
            osw.write(len);
        }
        isr.close();
        osw.close();

    }
}
