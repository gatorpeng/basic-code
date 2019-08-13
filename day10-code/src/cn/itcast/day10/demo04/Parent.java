package cn.itcast.day10.demo04;

public class Parent {

    int num = 10;

    public void method(){
        System.out.println("The parent class method. ");
    }

    public void methodParent() {
        System.out.println("The parent class special method");
    }

    public void show(){
        System.out.println(num);
    }

}
