package cn.itcast.demo04_Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Demo01Collections {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list,"a","b","c","e","d");
        System.out.println(list);

        Collections.shuffle(list);

        String[] st = {"a","bcd","edf"};
        System.out.println(st.equals(list));

        Collections.sort(list);
        System.out.println(list);
    }
}
