package cn.itcast.demo01_exception;

import java.io.IOException;

/*
* the finally block will be executed no matter what happened.
* */

public class Demo05TryCatchFinally {
    public static void main(String[] args) {
        try {
            readFile("C:/txt.txt");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("The resources have been released");
        }
    }

    public static void readFile(String filePath) throws IOException {

        if (!filePath.endsWith(".txt")) {
            throw new IOException("The suffix is incorrect.");
        }

        System.out.println("The file is correct and has been executed");
    }
}
