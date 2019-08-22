package cn.itcast.demo02_set;

import java.util.HashSet;
import java.util.Iterator;

public class Demo01HashSet {
    public static void main(String[] args) {

        HashSet<String> hSet = new HashSet<>();
        hSet.add("a");
        hSet.add("c");
        hSet.add("b");
        hSet.add("a");

        Iterator<String> iterator = hSet.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(next);
        }

        System.out.println("=============");

        for (String s : hSet) {
            System.out.println(s);
        }

    }
}
