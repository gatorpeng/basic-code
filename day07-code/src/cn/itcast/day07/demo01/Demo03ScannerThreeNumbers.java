package cn.itcast.day07.demo01;

import java.util.Scanner;

public class Demo03ScannerThreeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the first num:");
        int num1 = sc.nextInt();
        System.out.println("Please input the second num:");
        int num2 = sc.nextInt();
        System.out.println("Please input the third num:");
        int num3 = sc.nextInt();

        int max = num1>num2?num1:num2;
        int max2 = max>num3?max:num3;
        System.out.println(max2);
    }
}
