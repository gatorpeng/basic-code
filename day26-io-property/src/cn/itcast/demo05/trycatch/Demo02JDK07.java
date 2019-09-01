package cn.itcast.demo05.trycatch;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo02JDK07 {
    public static void main(String[] args) {

        try (FileInputStream fis = new FileInputStream("C:\\Users\\xinla\\Desktop\\Pictures\\Son\\MySon.jpg");
             FileOutputStream fos = new FileOutputStream("C:\\Users\\xinla\\Desktop\\Pictures\\Cuties\\MySon.jpg");){
            int len = 0;
            byte[] bytes = new byte[1024];
            while ((fis.read(bytes))!=-1) {
                fos.write(bytes);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
