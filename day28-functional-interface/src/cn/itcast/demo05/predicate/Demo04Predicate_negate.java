package cn.itcast.demo05.predicate;

import java.util.function.Predicate;

public class Demo04Predicate_negate {
    public static boolean checkString(String st, Predicate<String> pred1) {
        //return pred1.test(st) && pred2.test(st);
        return pred1.negate().test(st);
    }

    public static void main(String[] args) {
        String str = "ad";
        boolean check = checkString(str, (s) -> s.contains("a"));
        System.out.println(str+"->"+check);
    }
}
