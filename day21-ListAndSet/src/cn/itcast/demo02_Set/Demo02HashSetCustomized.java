package cn.itcast.demo02_Set;

import java.util.HashSet;

public class Demo02HashSetCustomized {

    public static void main(String[] args) {
        Person one = new Person("Scarlett Johansson", 30);
        Person two = new Person("Scarlett Johansson", 30);
        Person three = new Person("Julia Roberts", 36);

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);

        System.out.println("===========");

        System.out.println(one.hashCode());
        System.out.println(two.hashCode());

        System.out.println("===========");
        System.out.println(one.equals(two));

        HashSet<Person> set = new HashSet<Person>();
        set.add(one);
        set.add(two);
        set.add(three);

        System.out.println(set);

    }
}
