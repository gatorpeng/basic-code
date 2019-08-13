package cn.itcast.day10.demo06;

public class Keyboard implements USB {
    @Override
    public void open() {
        System.out.println("Open keyboard.");
    }

    @Override
    public void close() {
        System.out.println("Close keyboard");
    }

    public static void keyIn() {
        System.out.println("Keying in");
    }
}
