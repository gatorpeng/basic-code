package cn.itcast.day04.demo03;

public class Demo01MethodSame {
    public static void main(String[] args) {
        System.out.println("10=20,"+isSame(10,20));
    }

    public static boolean isSame(int a, int b) {
        return a==b;
    }
}
