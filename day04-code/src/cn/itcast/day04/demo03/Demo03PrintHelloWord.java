package cn.itcast.day04.demo03;

public class Demo03PrintHelloWord {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int count = a==b? 2:3;
        printHelloWorld(count);
    }

    public static void printHelloWorld(int count) {
//        for (int i = 0; i <= count; i++) {
//            System.out.println("Hello World" + i);
//        }
        int i = 1;
        while (i <= count) {
            System.out.println("Hello world" + i);
            i++;
        }
    }
}
