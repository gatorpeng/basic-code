package cn.itcast.day08.demo04;

import java.util.Scanner;

public class Demo06CountNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input a string:");
        String str = sc.next();

        char[] chars = str.toCharArray();

        int countNum = 0;
        int countUpper = 0;
        int countLower = 0;
        int countOthers = 0;

        for (int i = 0; i < chars.length; i++) {
            if ('A' <= chars[i] && chars[i] <= 'Z') {
                countUpper++;
            } else if ('a' <= chars[i] && chars[i] <= 'z') {
                countLower++;
            } else if ('0' <= chars[i] && chars[i] <= '9') {
                countNum++;
            } else {
                countOthers++;
            }
        }

        System.out.println("# of lowercase letters:" + countLower);
        System.out.println("# of upper case letters:" + countUpper);
        System.out.println("# of integers:" + countNum);
        System.out.println("The number of others:" + countOthers);

    }
}
