package cn.itcast.demo10.supermethodreference;

import java.util.ArrayList;

public class Demo01SuperMethodReference {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println(arr.length);

        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("1");
        System.out.println(list.size());
    }
}
