package cn.itcast.day06.demo04;

import org.w3c.dom.ls.LSOutput;

public class Demo02Student {

    public static void main(String[] args) {
        Celebrity stu1 = new Celebrity();
        System.out.println("===================");


        Celebrity stu = new Celebrity(20, "赵丽颖");
        System.out.println("Name: " +stu.getName());
        System.out.println("Age: " +stu.getAge());
        System.out.println("=======================");
//change the setting
        stu.setAge(32);
        stu.setName("赵丽颖");
        System.out.println("Name: " +stu.getName());
        System.out.println("Age: " +stu.getAge());
    }
}
