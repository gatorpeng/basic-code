package cn.itcast.day08.demo04;

public class Demo09MathPractice2 {
    public static void main(String[] args) {
        int count = 0;
        double min = Math.ceil(-10.8);

        for (double i = min; i < 5.9; i++) {
            if (Math.abs(i) > 6 || Math.abs(i) < 2.1) {
                count++;
                System.out.println(i);
            }
        }

        System.out.println("The count is: " + count);
    }
}
