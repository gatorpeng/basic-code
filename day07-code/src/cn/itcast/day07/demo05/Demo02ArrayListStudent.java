package cn.itcast.day07.demo05;

import java.util.ArrayList;

public class Demo02ArrayListStudent {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

        Student one = new Student("洪七公",21);
        Student two = new Student("黄药师",25);
        Student three = new Student("欧阳锋",23);
        Student four = new Student("段正淳",29);

        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        for (int i = 0; i < list.size(); i++) {
            Student stu = list.get(i);
            System.out.println("Name: " + stu.getName() +"; Age:" + stu.getAge());
        }



    }
}
