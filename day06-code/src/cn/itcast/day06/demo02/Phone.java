package cn.itcast.day06.demo02;

public class Phone {
    String brand;
    double price;
    String color;

    public void callWho(String who) {
        System.out.println("Call "+ who);
    }

    public void sendMessage() {
        System.out.println("Send message to multiple people!");
    }

}
