package cn.itcast.day09.demo04;

public class Zi extends Fu {
    int num = 20;

    public Zi() {
        this(123);
    }

    public Zi(int nnn) {
        this(123, 321);
    }

    public Zi(int aaa, int bbb) {

    }

    @Override
    public void method() {
        super.method();
        System.out.println("The method of the child class is executed");
    }

    public void show() {
        int num = 30;
        System.out.println(num);
        System.out.println(this.num);
        System.out.println(super.num);
    }

    public void methodA() {
        System.out.println("AAA");

    }

    public void methodB() {
        this.methodA();
        System.out.println("BBB");

    }

}
