package cn.itcast.day09.demo03;

public class Fu {
    int num = 10000;
    public Fu() {
        System.out.println("父类无参构造");
    }

    public Fu(int num) {
        System.out.println("父类有参构造");
    }

    public void show() {
        System.out.println("父类方法show ");
    }
}
