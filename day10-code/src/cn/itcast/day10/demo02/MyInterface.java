package cn.itcast.day10.demo02;

public interface MyInterface {

    public default void method() {
        System.out.println("The default method in the interface");
    }
}
