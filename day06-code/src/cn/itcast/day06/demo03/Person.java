package cn.itcast.day06.demo03;

public class Person {
    String name;
    private int age;

    public void show() {
        System.out.println("My name is " + name + " . I am " + age);
    }

    public void setAge(int num) {
        if (num >=0 && num <110){
            age = num;
        } else {
            System.out.println("The input is not reasonable!");
        }
    }

    public int getAge() {
        return age;
    }
}
