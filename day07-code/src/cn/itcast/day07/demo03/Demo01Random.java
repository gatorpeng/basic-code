package cn.itcast.day07.demo03;

import java.util.Random;

public class Demo01Random {
    public static void main(String[] args) {

        Random rdm = new Random();
        int num = rdm.nextInt();
        System.out.println("The generated random number  is "+num);

    }


}
