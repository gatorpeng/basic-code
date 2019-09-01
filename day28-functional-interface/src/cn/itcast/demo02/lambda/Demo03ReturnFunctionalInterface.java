package cn.itcast.demo02.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class Demo03ReturnFunctionalInterface {
    public static Comparator<String> getComparator() {
        /*return new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.length()-o1.length();
            }
        };*/

        // use the lambda expression to simplify it.
        return (o1,o2)->o2.length()-o1.length();
    }

    public static void main(String[] args) {
        String[] arr = {"aa","b","ccc","d"};
        // print the array before sorting
        System.out.println(Arrays.toString(arr));

        // sort the array by length and print it out
        Arrays.sort(arr,getComparator());
        System.out.println(Arrays.toString(arr));
    }
}
