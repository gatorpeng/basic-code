package cn.itcast.demo02_recursion;

import java.io.File;

// This code is intended to print the names of all folders and files in a given directory

public class Demo04RecursionTraverseFolder {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\xinla\\Desktop\\Pictures");
        getFileName(file);

    }

    public static void getFileName(File file) {
        System.out.println(file);
        File[] dir = file.listFiles();

        for (File fileName : dir) {
            if (fileName.isDirectory()) {
                getFileName(fileName);
            } else {
                System.out.println(fileName);
            }

        }
    }
}
