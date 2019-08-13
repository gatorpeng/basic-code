package cn.itcast.day10.demo05;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("The dog likes to eat grass");
    }
    public void watchHouse(){
        System.out.println("The dog can watch the house.");
    }
}
