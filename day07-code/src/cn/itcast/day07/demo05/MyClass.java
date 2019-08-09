package cn.itcast.day07.demo05;

public class MyClass {

    int num;
    static int num2;

    public void method(){
        System.out.println("这是一个普通的成员方法。");
        System.out.println(num);
        System.out.println(num2);
    }

    public static void methodStatic() {
        System.out.println("这是一个静态方法");
        System.out.println(num2);
    }
}
