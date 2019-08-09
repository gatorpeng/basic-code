package cn.itcast.day04.demo02;

public class Demo03Param {
    public static void main(String[] args) {

        printMethod();
        method1(10, 20);

    }

    public static void printMethod() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World!!" + i);
        }
    }

    public static void method1(int a, int b) {
        int result = a + b;
        System.out.println("Result = " + result);
    }

}
