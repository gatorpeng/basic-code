package cn.itcast.day09.demo06;

public class DemoMain {
    public static void main(String[] args) {
        DogJinMao jinMao = new DogJinMao();
        jinMao.eat();
        jinMao.sleep();
        System.out.println("==============");

        Dog2Ha erHa = new Dog2Ha();
        erHa.eat();
        erHa.sleep();
    }
}
