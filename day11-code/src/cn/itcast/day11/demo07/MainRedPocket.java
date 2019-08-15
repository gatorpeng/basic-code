package cn.itcast.day11.demo07;

import java.util.ArrayList;

public class MainRedPocket {
    public static void main(String[] args) {
        RedPocketDistribution dist = new RedPocketDistribution();
        ArrayList<Integer> redList = dist.normalRed(1000,3);
        for (int i = 0; i < redList.size(); i++) {
            System.out.println(redList.get(i));
        }
        System.out.println("============");


        ArrayList<Integer> redRandom = dist.randomRed(1000,5);
        for (int i = 0; i < redRandom.size(); i++) {
            System.out.println(redRandom.get(i));
        }


    }
}
