package cn.itcast.demo05.predicate;

import java.util.function.Predicate;

public class Demo02Predicate_and {
    public static boolean checkString(String st, Predicate<String> pred1,Predicate<String> pred2) {
        //return pred1.test(st) && pred2.test(st);
        return pred1.and(pred2).test(st);
    }

    public static void main(String[] args) {
        String str = "adfdafjkfjkd";
        boolean check = checkString(str, (s) -> s.length() > 6, (s) -> s.contains("a"));
        System.out.println(str+"->"+check);
    }
}
