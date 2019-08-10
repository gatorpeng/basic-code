package cn.itcast.day09.demo03;

public class Zi extends Fu{

    int num = 10;
    public Zi(){
//        super();
        System.out.println("子类无参构造");
    }

    public Zi(int num2) {
        System.out.println("子类有参构造");
    }

    public void show() {
        super.show();
        System.out.println("子类方法show");
        System.out.println("The number in the child class is " +num);
        System.out.println("The number in the parent class is "+super.num);
    }
}
