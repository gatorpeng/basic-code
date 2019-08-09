package cn.itcast.day07.demo05;

import java.util.ArrayList;

public class Demo02Practice {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();

        Person p1 = new Person("赵丽颖",20);
        Person p2 = new Person("迪丽热巴",22);
        Person p3 = new Person("古力娜扎",28);
        Person p4 = new Person("马尔扎哈",40);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);

        for (int i = 0; i < list.size(); i++) {
            Person stu = list.get(i);
            System.out.println(stu.getName() + stu.getAge());
        }





    }
}
