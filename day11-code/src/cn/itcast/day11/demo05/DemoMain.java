package cn.itcast.day11.demo05;

public class DemoMain {
    public static void main(String[] args) {

        Weapon weapon = new Weapon("AK-47");
        Hero hero = new Hero("Scarlette Johnasson",30,weapon);

        hero.attack();
    }
}
