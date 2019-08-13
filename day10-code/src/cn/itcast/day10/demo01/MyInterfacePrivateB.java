package cn.itcast.day10.demo01;

public interface MyInterfacePrivateB {

    public static void methodA() {
        System.out.println("Static Method A");
        methodCommon();
    }

    public static void methodB() {
        System.out.println("Static Method B");
        methodCommon();
    }

    private static void methodCommon() {
        System.out.println("AAAA");
        System.out.println("BBBB");
        System.out.println("CCCC");
    }
}
