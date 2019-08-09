package cn.itcast.day08.demo04;

import java.util.ArrayList;

public class Demo08MathPractice {
    public static void main(String[] args) {
        double min = -10.8;
        double max = 5.9;
        int count = 0;
        double min2 = Math.ceil(min);

        for (int i = (int) min2; i < max; i++) {
            if (Math.abs(i)>6 || Math.abs(i)<2.1) {
                count++;
            }
        }
        System.out.println(count);
    }
}
