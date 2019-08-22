package cn.ticast.demo06_generic;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo04Generic {
    public static void main(String[] args) {

//        demo01();
        demo02();
    }

    private static void demo02() {
        ArrayList<String> list = new ArrayList<>();
        list.add("abc");
        list.add("bcd");

//        Iterator<String> it = list.iterator();
        for (Iterator<String> it = list.iterator(); it.hasNext();) {
            String next = it.next();
            System.out.println(next);
            System.out.println(next.length());
        }
    }

    private static void demo01() {
        ArrayList list = new ArrayList();
        list.add("abc");
        list.add(1);

//        now we use the iterator to traverse the ArrayList
        Iterator it = list.iterator();

        while(it.hasNext()) {
            Object obj = it.next();
            String str = (String) obj;
            System.out.println(obj);
            System.out.println(str.length());
        }
    }
}
