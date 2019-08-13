package cn.itcast.day10.demo01;

public interface MyInterfacePrivateA {

    public default void methodA() {
        System.out.println("Default Method A");
        methodCommon();
    }

    public default void methodB() {
        System.out.println("Default Method B");
        methodCommon();
    }




    private void methodCommon() {
        System.out.println("AAAA");
        System.out.println("BBBB");
        System.out.println("CCCC");
    }
}
