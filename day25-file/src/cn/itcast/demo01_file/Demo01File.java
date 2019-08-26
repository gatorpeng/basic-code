package cn.itcast.demo01_file;

import java.io.File;

public class Demo01File {
    public static void main(String[] args) {
//        show01();

//        show02();

        show03();


    }

    private static void show03() {

        File parent = new File("C:\\", "Users");
        File file = new File(parent, "\\xinla\\Java");
        System.out.println(file);
    }

    private static void show02() {

        File file = new File("C:\\", "Users\\xinla\\Java");
        System.out.println(file);
    }

    private static void show01() {

        File file = new File("C:\\Users\\xinla\\Java");
        System.out.println(file);

        File file01 = new File("C:\\Users\\xinla\\Java\\a.txt");
        System.out.println(file01);

        File file02 = new File("a.txt");
        System.out.println(file02);

    }
}
