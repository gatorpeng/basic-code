package cn.itcast.day08.demo04;

import java.util.Arrays;

public class Demo01Arrays {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 5, 4};
        System.out.println(Arrays.toString(intArray));

        int[] array1 = {2, 3, 8, 3,4,1};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));


        String[] array2 = {"cad","bbb","dcs"};
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));

    }
}
