package cn.itcast.day07.demo05;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;

public class Demo01Practice {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Random rand  = new Random();
        int[] array = new int[6];

        for (int i = 0; i < 6; i++) {
            list.add(rand.nextInt(32)+1);
            array[i]=rand.nextInt(32)+1;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(list.get(i));
        }
        System.out.println("==============");
        System.out.println(Arrays.toString(array));


    }
}
