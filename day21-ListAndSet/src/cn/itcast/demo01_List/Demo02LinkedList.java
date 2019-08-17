package cn.itcast.demo01_List;

import java.util.LinkedList;


/*
* the common method:
* .add
* .addFirst
* .push
* .addLast
* .removeFirst
* .pop
* .removeLast
* .isempty()
* .clear
* .getFirst
* .getLast
* */

public class Demo02LinkedList {
    public static void main(String[] args) {
        show01();
    }

    private static void show01() {
        LinkedList<String> linked = new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");

        System.out.println(linked);

//        linked.addFirst("www.");
        linked.push("www.");
        linked.addLast(".com");

        System.out.println(linked);



    }
}
