package cn.itcast.demo07.buffer;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
* source:C:\Users\xinla\Desktop\Pictures\Son\MySon.jpg
* target:C:\Users\xinla\Desktop\Pictures\
* */
public class Demo03CopyFile {
    public static void main(String[] args) throws IOException {
        File target = new File("C:\\Users\\xinla\\Desktop\\Pictures\\Cuties");
        target.mkdir();
        long startTime = System.currentTimeMillis();
        FileInputStream fos = new FileInputStream("C:\\Users\\xinla\\Desktop\\Pictures\\Son\\MySon.jpg");
        FileOutputStream fis = new FileOutputStream("C:\\Users\\xinla\\Desktop\\Pictures\\Cuties\\MySon.jpg");

        int len = 0;
        byte[] bytes = new byte[1024];
        while ((fos.read(bytes))!=-1) {
            fis.write(bytes);
        }
        fos.close();
        fis.close();

        long endTime = System.currentTimeMillis();
        System.out.println("Time consumed: " + (endTime-startTime) +" ms"); // 11 millisecond

    }
}
