package cn.itcast.demo01_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo01List {
    public static void main(String[] args) {

        List<String> list  = new ArrayList<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("a");
        System.out.println(list);

        list.add(3,"f");
        System.out.println(list);

        System.out.println("================");

        String removeD = list.remove(4);
        System.out.println(removeD);

        System.out.println("=================");

        String replaceA = list.set(4, "A");
        System.out.println(list); //[a, b, c, f, A]

        for (String s : list) {
            System.out.println(s);
        }

        Collections.shuffle(list);
        System.out.println(list);

        System.out.println("============");
        Collections.sort(list);
        System.out.println(list);

    }
}
