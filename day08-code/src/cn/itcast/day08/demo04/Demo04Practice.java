package cn.itcast.day08.demo04;

import java.util.Arrays;

public class Demo04Practice {
    public static void main(String[] args) {
        String str1 = new String();

        char[] chars = {'a','c','a'};
        String str2 = new String(chars);

        String str0 = Arrays.toString(chars);
        System.out.println("str0" + str0);


        System.out.println(str2);

        byte[] bytes = {97,99,97};

        String str3 = new String(bytes);
        System.out.println(str3);

        System.out.println("str2==str3"+ str2==str3); // false

        String str4  = "aCa";

        System.out.println(str4.equals(str2));
        System.out.println(str4.equalsIgnoreCase(str2));

        String str5 = str4.concat("eDe");
        System.out.println(str5);

        System.out.println(str4.charAt(1));

        System.out.println(str5.substring(1));
        System.out.println(str5.substring(1,4));


    }
}
