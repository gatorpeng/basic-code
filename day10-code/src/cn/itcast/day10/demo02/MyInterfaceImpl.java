package cn.itcast.day10.demo02;

public class MyInterfaceImpl implements MyInterfaceA, MyInterfaceB{
    @Override
    public void methodA() {

    }

    @Override
    public void methodB() {

    }

    @Override
    public void methodDefault() {
        System.out.println("The default method has been override");
    }
}
