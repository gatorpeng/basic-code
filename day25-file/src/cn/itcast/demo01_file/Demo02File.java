package cn.itcast.demo01_file;

import java.io.File;

/*
* getName: get the name of the file or the last name of the path name sequence;
* getPath: return the path of the file or object
* getAbsolutePath:
* length
*
* */

public class Demo02File {
    public static void main(String[] args) {

        File f1 = new File("a.txt");
        String absolutePath01 = f1.getAbsolutePath();
        System.out.println(absolutePath01);

        File f2 = new File("C:\\Users\\xinla\\Desktop\\Java Interview Questions\\From Daowei.txt");
        String name01 = f2.getName();
        System.out.println(name01);

        File f3 = new File("C:\\Users\\xinla\\Desktop\\Java Interview Questions");
        String name02 = f3.getName();
        System.out.println(name02);

        //note: to string is similar to getpath.

        String path = f3.getPath();
        System.out.println(path);
        System.out.println(f3.toString());


    }
}
