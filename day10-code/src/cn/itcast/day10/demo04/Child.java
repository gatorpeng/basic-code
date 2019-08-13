package cn.itcast.day10.demo04;

public class Child extends Parent {

    int num = 20;

    @Override
    public void method() {
        System.out.println("The child class method");
    }

    @Override
    public void show() {
        System.out.println(num);
    }
}
