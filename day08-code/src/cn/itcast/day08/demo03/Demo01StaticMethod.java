package cn.itcast.day08.demo03;

public class Demo01StaticMethod {
    public static void main(String[] args) {
        MyClass.methodStatic(); // 0
        System.out.println("=======");
        MyClass.numStatic = 10;
        MyClass.methodStatic(); // 10;


        System.out.println("============");
        System.out.println("Define an object");
        MyClass myClass = new MyClass();
        myClass.num = 20;
        myClass.method(); // 20
        myClass.methodStatic(); //10

    }
}
