package cn.itcast.demo05.predicate;

import java.util.function.Predicate;

public class Demo01Predicate {

    public static boolean stringLength(String st, Predicate<String> pred) {
        return pred.test(st);
    }

    public static void main(String[] args) {
        String str  = "avasdkd";

        boolean b = stringLength(str, st -> st.length() > 6);
        System.out.println(b);
    }
}
