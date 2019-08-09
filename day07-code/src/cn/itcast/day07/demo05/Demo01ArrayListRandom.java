package cn.itcast.day07.demo05;

import java.util.ArrayList;
import java.util.Random;

public class Demo01ArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Random random = new Random();

        for (int i = 0; i < 6; i++) {
            list.add(random.nextInt(33)+1);
            System.out.println(list.get(i));

        }
    }
}
