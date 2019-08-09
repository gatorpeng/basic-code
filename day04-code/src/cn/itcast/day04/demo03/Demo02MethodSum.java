package cn.itcast.day04.demo03;

public class Demo02MethodSum {

    public static void main(String[] args) {
        System.out.println("The total sum of the numbers from 0 to 100 is "+getSum());
    }

    public static int getSum() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }
}
