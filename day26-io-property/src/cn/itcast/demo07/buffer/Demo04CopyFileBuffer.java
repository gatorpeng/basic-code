package cn.itcast.demo07.buffer;


import java.io.*;

/*
* source:C:\Users\xinla\Desktop\Pictures\Son\MySon.jpg
* target:C:\Users\xinla\Desktop\Pictures\
* */
public class Demo04CopyFileBuffer {
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("C:\\Users\\xinla\\Desktop\\Pictures\\Son\\MySon.jpg"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("C:\\Users\\xinla\\Desktop\\Pictures\\Cuties\\MySon.jpg"));

        int len = 0;
        byte[] bytes = new byte[1024];
        while ((bis.read(bytes))!=-1) {
            bos.write(bytes);
        }
        bos.close();
        bis.close();

        long endTime = System.currentTimeMillis();
        System.out.println("Time consumed: " + (endTime-startTime) +" ms"); // 11 millisecond

    }
}
