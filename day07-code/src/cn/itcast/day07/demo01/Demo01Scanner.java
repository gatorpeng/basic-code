package cn.itcast.day07.demo01;

import java.util.Scanner;

public class Demo01Scanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("The keyboard input is " + num);

        String str = sc.next();
        System.out.println("The keyboard in put is " + str);

        String[] str1 = new String[] {"My Wife is hot"};
        System.out.println("The input is "+str1.length);

    }
}
