package cn.ticast.demo02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo04Practice {
    public static void main(String[] args) throws ParseException {

        System.out.println("Please input your date of birth (Format: MM/dd/yyyy):");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        SimpleDateFormat sdf;
        sdf = new SimpleDateFormat("MM/dd/yyyy");
        Date dob = sdf.parse(str);
        long millis = dob.getTime();

        long current = new Date().getTime();

        String todayDate = sdf.format(current);

        System.out.println("Today is: " +todayDate);

        long diff = current-millis;

        int days = (int) (diff/1000/(24*60*60));

        System.out.println("How many days from the DOB to now: " +days);
    }
}
