package cn.itcast.demo05.trycatch;

import java.io.FileWriter;
import java.io.IOException;

public class Demo01TryCatch {
    public static void main(String[] args) {
        FileWriter fw = null;

        try {
            fw = new FileWriter("day26-io-property//d.txt",true);
            for (int i = 0; i < 10; i++) {
                fw.write("Hello World!" + "\r\n");
            }
            fw.write(97);

        } catch(IOException e) {
            System.out.println(e);
        } finally {
            if (fw!=null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
