package cn.itcast.demo04_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo03CollectionComparator {
    public static void main(String[] args) {

        ArrayList<Student> list01 = new ArrayList<>();
        list01.add(new Student("Leonardo Dicaprio", 38));
        list01.add(new Student("George Clooney", 52));
        list01.add(new Student("Brad Pitt", 45));

        System.out.println(list01);
        System.out.println("===========");

        Collections.sort(list01, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println(list01);


    }
}
