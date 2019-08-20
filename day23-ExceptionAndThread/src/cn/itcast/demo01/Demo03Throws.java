package cn.itcast.demo01;

import java.io.IOException;

/*
* two methods to handle exceptions
* */

public class Demo03Throws {
    public static void main(String[] args) throws IOException {
        readFile("C://final.tx");

        // if there is an exception, the following command will be executed.
        System.out.println("Other codes");
    }

    public static void readFile(String filePath) throws IOException {
        /*if (!filePath.equals("C://final.txt")){
            throw new FileNotFoundException("the directory is incorrect!");
        }*/

        if (!filePath.endsWith(".txt")) {
            throw new IOException("The suffix is incorrect.");
        }
    }
}
