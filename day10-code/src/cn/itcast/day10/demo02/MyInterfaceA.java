package cn.itcast.day10.demo02;

public interface MyInterfaceA {

    public abstract void methodA();

    public default void methodDefault() {
        System.out.println("Default method AAAA");
    }



}
