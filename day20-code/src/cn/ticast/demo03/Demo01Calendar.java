package cn.ticast.demo03;

import java.util.Calendar;
import java.util.Date;
import java.util.jar.JarOutputStream;

public class Demo01Calendar {
    public static void main(String[] args) {
//        demo01();


        demo02();


    }

    private static void demo02() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.YEAR,1999);
        calendar.set(calendar.MONTH,10);
        calendar.set(calendar.DATE,10);

        calendar.set(9999,10,10);

        calendar.add(calendar.YEAR, -100);
        calendar.add(calendar.MONTH,1);

        int yearToday = calendar.get(Calendar.YEAR);
        int monthToday = calendar.get(Calendar.MONTH);

        System.out.println(yearToday);
        System.out.println(monthToday);

        Date date = calendar.getTime();
        System.out.println(date);
    }

    private static void demo01() {
        Calendar calendar = Calendar.getInstance();
        int yearToday = calendar.get(Calendar.YEAR);
        int monthToday = calendar.get(Calendar.MONTH);

        System.out.println(yearToday);
        System.out.println(monthToday);
    }
}
