package cn.ticast.demo01;


public class Demo02ToStringDefault {
    public static void main(String[] args) {
        String str  = "Hello";
        String str2 = "Hello";

        char[] chars = {'H','e','l','l','o'};
        String str3 = new String(chars);

        System.out.println(str.equals(str2));

        System.out.println(str==str3);
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str.equals(str3));
    }
}
