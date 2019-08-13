package cn.itcast.day11.demo04;

public class MyInterfaceImpl implements MyInterface {

    @Override
    public void methodInterface1() {
        System.out.println("The method 1 has been overridden");
    }

    @Override
    public void methodInterface2() {
        System.out.println("The method 2 has been overridden");
    }
}
