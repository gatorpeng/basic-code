package cn.itcast.day10.demo02;

public interface MyInterfaceB {

    public abstract void methodB();

    public default void methodDefault() {
        System.out.println("Default method AAAA");
    }
}
