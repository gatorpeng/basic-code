package cn.itcast.day07.demo02;

import java.util.Scanner;

public class Demo02Anonymous {
    public static void main(String[] args) {

        Scanner sc = methodReturn();
        System.out.println("The first num: ");
        int num1 = sc.nextInt();
        System.out.println("The second num: ");
        int num2 = sc.nextInt();

methodParam(new Scanner(System.in));

    }

    public static void methodParam(Scanner sc){
        System.out.println("Input:");
        int num = sc.nextInt();
        System.out.println("The input is: "+num);
    }

    public static Scanner methodReturn(){
        return new Scanner(System.in);
    }

}
