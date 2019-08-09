package cn.itcast.day07.demo03;

import java.util.Random;
import java.util.Scanner;

public class Demo03GuessNumber {
    public static void main(String[] args) {

        Random rc = new Random();
        int trueNum = rc.nextInt(101);
        Scanner sc = new Scanner(System.in);

        System.out.println("Please make a guess:");
        int guessNum = sc.nextInt();

        while (true) {
            if (guessNum>trueNum) {
                System.out.println("It is bigger. And please input another:");
                guessNum = sc.nextInt();
            } else if (guessNum<trueNum){
                System.out.println("It is smaller. And please input another:");
                guessNum = sc.nextInt();
            } else {
                System.out.println("Congrats! You are correct.");
                break;
            }


        }
        System.out.println("Game Over.");


    }
}
