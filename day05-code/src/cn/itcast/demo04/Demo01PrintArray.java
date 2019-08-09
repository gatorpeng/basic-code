package cn.itcast.demo04;

import java.util.Arrays;

public class Demo01PrintArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                System.out.print("[" + array[i]+",");
            } else if (i == array.length - 1) {
                System.out.println(","+array[i]+"]");
            } else {
                System.out.print(array[i]+",");
            }
        }
// object-oriented
        System.out.println("=====================");
        System.out.println(Arrays.toString(array));
    }
}
