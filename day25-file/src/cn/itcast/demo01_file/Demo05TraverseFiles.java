package cn.itcast.demo01_file;

import java.io.File;

public class Demo05TraverseFiles {
    public static void main(String[] args) {
        File f1 = new File("C:\\Users\\xinla\\Java\\IdeaProject\\basic-code01\\day25-file");
        String[] list = f1.list();

        for (String fileName : list) {
            System.out.println(fileName);
        }

        System.out.println("================");

        File[] fileName2 = f1.listFiles();
        for (File file : fileName2) {
            System.out.println(file);
        }
    }
}
