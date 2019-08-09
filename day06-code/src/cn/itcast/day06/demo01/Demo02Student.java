package cn.itcast.day06.demo01;


public class Demo02Student {
    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("=====================");

        stu.name = "Elbert";
        stu.age  = 2;
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println("=====================");


        stu.eat();
        System.out.println("=====================");
        stu.sleep();
    }
}
