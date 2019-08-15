package cn.ticast.demo01;

import java.util.Objects;

public class Demo03Objects {
    public static void main(String[] args) {
        String str1  = "abc";
        String str2  = "aBC";
        String str3 = null;

        boolean b = str1.equals(str2);

        boolean b1 = Objects.equals(str1, str3);

        System.out.println(b1);


    }
}
