package cn.itcast.demo03_VariableArguments;

import java.util.Arrays;
/*
* the most common format of the variable arguments is
* Object...obj
* */

public class Demo01VarArgs {
    public static void main(String[] args) {

        int sum = getSum(1, 2,3,4,5);
        System.out.println(sum);
    }

    private static int getSum(int...arr) {
        int sum = 0;
        System.out.println(Arrays.toString(arr));
        for (int i : arr) {
            sum +=i;
        }
        return sum;
    }
}