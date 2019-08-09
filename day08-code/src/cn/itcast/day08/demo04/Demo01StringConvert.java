package cn.itcast.day08.demo04;

import java.util.Arrays;
import java.util.Scanner;

public class Demo01StringConvert {
    public static void main(String[] args) {

//        int[] array = {1,2,3,4};
//        System.out.println(array);
//        System.out.println(Arrays.toString(array));

        String str1  = "abc";
        char[] chars = str1.toCharArray();
        System.out.println(Arrays.toString(chars));

        byte[] bytes = str1.getBytes();
        for (int i = 0; i < bytes.length; i++) {
            System.out.println(bytes[i]);
        }

        String str2 = "How do you do?" ;
        String str3 = str2.replace("o", "*");
        System.out.println(str3);

        Scanner temp = new Scanner(System.in);

        System.out.println("Please input a number");

        int num = temp.nextInt();



    }
}
