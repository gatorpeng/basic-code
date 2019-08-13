package cn.itcast.day10.demo06;

public class DemoMain {
    public static void main(String[] args) {

        Keyboard.keyIn();
        Computer computer = new Computer();
        computer.powerOn();
        computer.useDevice(new Mouse());
        computer.useDevice(new Keyboard());
        computer.powerOff();
    }
}
