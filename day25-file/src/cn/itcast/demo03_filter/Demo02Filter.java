package cn.itcast.demo03_filter;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

// This code is intended to print the names of all folders and files in a given directory

public class Demo02Filter {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\xinla\\Desktop\\Pictures");
        getFileName(file);

    }

    public static void getFileName(File file) {
//        System.out.println(file);
        /*File[] dir = file.listFiles(new FileFilter(){

            @Override
            public boolean accept(File pathname) {
                return pathname.isDirectory()||pathname.getName().toLowerCase().endsWith(".txt");
            }
        });*/

        File[] dir = file.listFiles(pathname -> pathname.isDirectory()||pathname.getName().toLowerCase().endsWith(".txt"));


        /*File[] dir = file.listFiles(new FilenameFilter(){


            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isDirectory()||name.endsWith(".txt");
            }
        });*/

//        File[] dir = file.listFiles((d, name)-> (new File(d,name).isDirectory()||name.toLowerCase().endsWith(".txt")));


        for (File fileName : dir) {
            if (fileName.isDirectory()) {
                getFileName(fileName);
            } else {
                System.out.println(fileName);
            }

        }
    }
}
