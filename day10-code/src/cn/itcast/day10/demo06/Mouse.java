package cn.itcast.day10.demo06;

public class Mouse implements USB {
    @Override
    public void open() {
        System.out.println("Open mouse.");
    }

    @Override
    public void close() {
        System.out.println("Close mouse");
    }

    public static void click() {
        System.out.println("Click mouse");
    }
}
