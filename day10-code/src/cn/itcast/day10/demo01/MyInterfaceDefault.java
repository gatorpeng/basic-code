package cn.itcast.day10.demo01;

public interface MyInterfaceDefault {

    public abstract void methodAbs1();

//    public abstract void methodAbs2();

    public default void methodDefault() {
        System.out.println("This is a new default method. ");
    }

}
