package cn.itcast.day06.demo02;

import cn.itcast.day06.demo01.Student;


public class Demo01CallPhone {
    public static void main(String[] args) {
        Phone one = new Phone();
        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("=================");

        one.brand = "Iphone";
        one.color = "Rose Golden";
        one.price = 8888.88;

        System.out.println(one.brand);
        System.out.println(one.price);
        System.out.println(one.color);
        System.out.println("=================");

        one.callWho("Jobs");
        one.sendMessage();
        System.out.println("=================");

        Phone two = new Phone();
        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
        System.out.println("=================");

        two.brand = "Sumsang";
        two.color = "Blue";
        two.price = 5999.88;

        System.out.println(two.brand);
        System.out.println(two.price);
        System.out.println(two.color);
        System.out.println("=================");

        two.callWho("Ouba");
        two.sendMessage();
        System.out.println("=================");

        System.out.println(one.brand);

    }
}
