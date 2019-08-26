package cn.itcast.demo01_file;

import java.io.File;

/*
* the purpose of this file is to learn about the common methods in the File Class;
* exists();
* isFile();
* isDirectory();
* */
public class Demo03File {
    public static void main(String[] args) {
        File f1 = new File("a.txt");
        System.out.println(f1.exists());

        File f2 = new File("C:\\Users\\xinla\\Desktop\\Java Interview Questions\\From Daowei.txt");
        if (f2.exists()) {
            System.out.println(f2.isFile());
            System.out.println(f2.isDirectory());
        }


        File f3 = new File("C:\\Users\\xinla\\Desktop\\Java Interview Questions");
        if (f3.exists()) {
            System.out.println(f3.isFile());
            System.out.println(f3.isDirectory());
        }
    }
}
