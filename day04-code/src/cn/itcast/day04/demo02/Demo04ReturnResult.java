package cn.itcast.day04.demo02;

public class Demo04ReturnResult {
    public static void main(String[] args) {
        int num = getSum(20,50);
        System.out.println("20+50=" + num);
        System.out.println("=========");
        printSum(30,50);

    }

    public static int getSum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println("Result = " + sum);
        System.out.println("Result = " + sum);
    }

}
