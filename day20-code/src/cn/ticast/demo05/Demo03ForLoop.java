package cn.ticast.demo05;

import java.util.ArrayList;

public class Demo03ForLoop {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        list.add("high school degree");
        list.add("bachelor degree");
        list.add("master degree");
        list.add("doctorate degree");
        list.add("others");

        for (String str : list) {
            System.out.println(str);
        }


    }
}
