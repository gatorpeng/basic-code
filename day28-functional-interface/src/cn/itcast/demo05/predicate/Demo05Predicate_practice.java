package cn.itcast.demo05.predicate;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Demo05Predicate_practice {

    public static ArrayList<String> filer(String[] arr, Predicate<String> pred1,Predicate<String> pred2) {
        ArrayList<String> list = new ArrayList<>();
        for (String s : arr) {
            boolean b = pred1.and(pred2).test(s);
            if (b==true) {
                list.add(s);
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String[] arr = {"Scarlett Johansson, Female","Julia Roberts, Female","Leonardo Dicapcio, Male"};
        ArrayList<String> list = filer(arr, (s) -> {
            return s.split(",")[1].equals(" Female");
        }, (s) -> {
            String s1 = s.split(",")[0];
            return s1.length()>8;
        });

        for (String s : list) {
            System.out.println(s);
        }

    }
}


