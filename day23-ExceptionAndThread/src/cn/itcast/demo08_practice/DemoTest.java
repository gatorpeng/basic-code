package cn.itcast.demo08_practice;

import java.util.ArrayList;

public class DemoTest {
    public static void main(String[] args) {
        /*Dumpling bozi = new Dumpling();

        new Customer(bozi).start();
        new Manufacturer(bozi).start();*/

        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list.get(2));
    }
}
