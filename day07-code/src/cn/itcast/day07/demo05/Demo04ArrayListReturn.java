package cn.itcast.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

public class Demo04ArrayListReturn {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 20; i++) {

            list.add(rand.nextInt(100)+1);
        }

        System.out.println(list);
        System.out.println("===============");

        ArrayList<Integer> list1 = arrayListEven(list);
        System.out.println(list1);

        list1.remove(1);
        System.out.println(list1);

    }

    public static ArrayList<Integer> arrayListEven(ArrayList<Integer> list) {
        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < list.size(); i++) {
            int num = list.get(i);
            if (list.get(i) % 2 == 0) {
                list1.add(list.get(i));
            } else {
            }
            ;
        }

        return list1;
    }
}
