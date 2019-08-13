package cn.itcast.day10.demo05;

public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("The cat likes to eat fish.");
    }

    public void catchMouse() {
        System.out.println("The cat can catch mouse");
    }
}
