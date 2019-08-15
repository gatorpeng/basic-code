package cn.ticast.demo02;

import java.util.Date;

public class Demo02Date {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);

        date = new Date(1565818621707L);
        System.out.println(date);

        date = new Date(0L);
        System.out.println(date);

        date = new Date();
        System.out.println(date.getTime());

        System.out.println(System.currentTimeMillis());
    }
}
