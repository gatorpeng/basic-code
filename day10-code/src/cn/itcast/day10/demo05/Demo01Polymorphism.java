package cn.itcast.day10.demo05;

public class Demo01Polymorphism {
    public static void main(String[] args) {

        Animal cat = new Cat();
        cat.eat();

        Cat cat1 = (Cat) cat;
        cat1.catchMouse();
    }

}
