package cn.itcast.day07.demo03;

import java.util.Random;

public class Demo02RandomBound {
    public static void main(String[] args) {
        Random rand = new Random();


        for (int i = 0; i < 10; i++) {
            int num = rand.nextInt(10);
            System.out.println(num);
        }

    }
}
