package cn.itcast.day07.demo01;
import java.util.Scanner;

public class Demo02ScannerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please input the first num:");
        int num1 = sc.nextInt();
        System.out.println("Please input the second num:");
        int num2 = sc.nextInt();
        int num = num1 + num2;
        System.out.println("The sum is " + num);
    }
}
