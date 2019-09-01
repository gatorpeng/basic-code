package cn.itcast.demo05.predicate;

import java.util.function.Predicate;

public class Demo03Predicate_or {
    public static boolean checkString(String st, Predicate<String> pred1,Predicate<String> pred2) {
        //return pred1.test(st) && pred2.test(st);
        return pred1.or(pred2).test(st);
    }

    public static void main(String[] args) {
        String str = "ad";
        boolean check = checkString(str, (s) -> s.length() > 6, (s) -> s.contains("a"));
        System.out.println(str+"->"+check);
    }
}
