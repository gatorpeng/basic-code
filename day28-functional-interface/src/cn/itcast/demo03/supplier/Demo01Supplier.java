package cn.itcast.demo03.supplier;

import java.util.function.Supplier;

public class Demo01Supplier {
    public static String getString(Supplier<String> st) {
        return st.get();
    }

    public static void main(String[] args) {
        String str = getString(()->"Scarlett Johansson");

        System.out.println(str);
    }
}
