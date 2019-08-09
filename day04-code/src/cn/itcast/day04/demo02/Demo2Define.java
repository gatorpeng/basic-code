package cn.itcast.day04.demo02;

public class Demo2Define {
    public static void main(String[] args) {
        int result;
        result = sum(10, 2);
        System.out.println("The sum is "+result);
    }

    public static int sum(int a, int b) {
        int result;
        result = a + b;
        System.out.println("The calculation has been executed.");
        return result;
    }
}
