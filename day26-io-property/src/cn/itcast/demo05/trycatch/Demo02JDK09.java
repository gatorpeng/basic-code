package cn.itcast.demo05.trycatch;

import java.io.*;

public class Demo02JDK09 {
    public static void main(String[] args) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("C:\\Users\\xinla\\Desktop\\Pictures\\Son\\MySon.jpg");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\xinla\\Desktop\\Pictures\\Cuties\\MySon.jpg");

        try (fis;fos){
            int len = 0;
            byte[] bytes = new byte[1024];
            while ((fis.read(bytes))!=-1) {
                fos.write(bytes);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        File file = new File("day26-io-property//a.txt");
        file.delete();
    }
}
