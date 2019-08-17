package cn.ticast.demo05;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Demo02Iterator {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<>();
        coll.add("Kevin Durant");
        coll.add("Stephen Curry");
        coll.add("Klay Thompson");
        coll.add("Draymond Green");
        coll.add("DeMarcus Cousins");

        System.out.println(coll);
        System.out.println("===============");

        Iterator<String> iterator = coll.iterator();

        /*while (iterator.hasNext()) {
//            iterator.next();
            System.out.println(iterator.next());
        }*/

        /*for (Iterator<String> iterator2 = coll.iterator();iterator2.hasNext();) {
            System.out.println(iterator2.next());
        }*/

        for (String s : coll) {
            System.out.println(s);
        }
    }
}
