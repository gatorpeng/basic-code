package cn.ticast.demo04;

public class Demo02PrimitiveAndString {
    public static void main(String[] args) {
        int int1 = 1;
        int int2 = 2;
        int int3 = 3;

        String str1 = Integer.toString(int1);
        String str2 = String.valueOf(int2);
        String str3 = int3+"";

        System.out.println(str3+100);

        int is1 = Integer.parseInt(str1);
        System.out.println(is1==int1);


    }
}
