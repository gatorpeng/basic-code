package cn.ticast.demo06_generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo05GenericQuestionMark {
    public static void main(String[] args) {

        ArrayList<String> listA = new ArrayList<>();
        listA.add("Leonardo Dicaprio");
        listA.add("George Clooney");
        listA.add("Hugh Grant");

        ArrayList<Integer> listB = new ArrayList<>();
        listB.add(1);
        listB.add(2);
        listB.add(23);

        ArrayList<Object> listC = new ArrayList<>();
        listC.add("Volvo");
        listC.add(456);
        listC.add("Hugh Grant");

        printArrayList(listA);
        System.out.println("====");
        printArrayList(listB);

        System.out.println("====");
        printArrayList(listC);

    }

    public static void printArrayList(ArrayList<?> list) {
        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
