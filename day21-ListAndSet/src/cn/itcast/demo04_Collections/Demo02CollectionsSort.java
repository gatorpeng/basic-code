package cn.itcast.demo04_Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Demo02CollectionsSort {
    public static void main(String[] args) {

        ArrayList<Person> list = new ArrayList<Person>();
        Person one = new Person("Scarlett Johanson", 28);
        Person two = new Person("Jennifer Aniston", 45);
        Person three = new Person("Angelina Jolie", 35);

        list.add(one);
        list.add(two);
        list.add(three);
        System.out.println(list);
        System.out.println("==============");


        Collections.sort(list);
        System.out.println(list);
        System.out.println("==================");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("abv");
        list1.add("ccc");
        list1.add("ded");
        list1.add("bdm");
        System.out.println(list1);

        Collections.sort(list1);
        System.out.println(list1);
    }
}
