package cn.itcast.day06.demo02;

public class Demo04PhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "Iphone";
        one.price = 8898.0;
        method(one);

    }

    public static void method(Phone param){

        System.out.println(param.brand);
        System.out.println(param.price);
        System.out.println(param.color);

    }
}
