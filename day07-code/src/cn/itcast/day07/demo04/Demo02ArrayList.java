package cn.itcast.day07.demo04;

import java.util.ArrayList;

public class Demo02ArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(list);

        list.add(1);
        list.add(0);
        list.add(555);
        list.add(8928);

        System.out.println(list);
    }
}
