package cn.itcast.day10.demo01;

public class MyInterfaceDefaultImplB implements MyInterfaceDefault {
    @Override
    public void methodAbs1() {
        System.out.println("The implementation class, BBB");
    }

    @Override
    public void methodDefault() {
        System.out.println("The default method has been override");
    }
}
