package cn.ticast.demo02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo03DateFormat {

    public static void main(String[] args) throws ParseException {

        char[] chars = {'H','e','l','l','o'};
        String str;
        str = new String(chars);

        int[] array = {1,2,3};
        String str3 = Integer.toString(array[1]);
        String str2 = new String(String.valueOf(array));
        System.out.println(str3);


        demo01();
        demo02();

    }

    private static void demo01() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String str = sdf.format(date);
        System.out.println(str); //2019-08-15 08:25:11
        System.out.println(date);

    }

    private static void demo02() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date str = sdf.parse("2019-08-15 08:25:01");
        System.out.println(str); //2019-08-15 08:25:11

    }
}
