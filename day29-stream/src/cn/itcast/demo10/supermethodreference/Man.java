package cn.itcast.demo10.supermethodreference;

public class Man extends Human {
    @Override
    public void sayHello() {
        System.out.println("Man");
    }

    public void method(Greeting gt) {
        gt.greet();
    }

    public void show() {
        method(super::sayHello);
    }

    public static void main(String[] args) {
        new Man().show();
        new Man().sayHello();
    }

}
