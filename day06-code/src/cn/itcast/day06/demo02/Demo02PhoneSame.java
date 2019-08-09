package cn.itcast.day06.demo02;

public class Demo02PhoneSame {
    public static void main(String[] args) {
        Phone One = new Phone();
        System.out.println(One.brand);
        System.out.println(One.price);
        System.out.println(One.color);
        System.out.println("=================");

        One.brand = "Iphone";
        One.color = "Rose Golden";
        One.price = 8888.88;

        System.out.println(One.brand);
        System.out.println(One.price);
        System.out.println(One.color);
        System.out.println("=================");

        One.callWho("Jobs");
        One.sendMessage();
        System.out.println("=================");

        Phone Two = One;
        System.out.println(Two.brand);
        System.out.println(Two.price);
        System.out.println(Two.color);
        System.out.println("=================");

        Two.brand = "Sumsang";
        Two.color = "Blue";
        Two.price = 5999.88;

        System.out.println(Two.brand);
        System.out.println(Two.price);
        System.out.println(Two.color);
        System.out.println("=================");

        Two.callWho("Ouba");
        Two.sendMessage();
        System.out.println("=================");

        System.out.println(One.brand);

    }
}
