package cn.itcast.demo02_Set;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Demo03LinkedHarshSet {
    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();
        set.add("espn");
        set.add("mitbbs");
        set.add("mitbbs");
        set.add("sina");
        set.add("yahoo");
        System.out.println(set);
        System.out.println("espn".hashCode());
        System.out.println("mitbbs".hashCode());
        System.out.println("sina".hashCode());
        System.out.println("yahoo".hashCode());
        System.out.println("================");

        LinkedHashSet<String> linked = new LinkedHashSet<>();
        linked.add("espn");
        linked.add("mitbbs");
        linked.add("mitbbs");
        linked.add("sina");
        linked.add("yahoo");
        System.out.println(linked);
    }
}
