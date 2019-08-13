package cn.itcast.day08.demo03;

public class MyClass {
    int num;
    static int numStatic;

    public void method() {
        System.out.println("This is a member method in this class");
        System.out.println(num);
        System.out.println(numStatic);
    }

    public static void methodStatic() {
        System.out.println("This is a static method in this class");
        System.out.println(numStatic);
    }
}
