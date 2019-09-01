package cn.itcast.demo06.function;

import java.util.function.Function;

public class Demo01Function {
    public static void conversion(String str, Function<String, Integer> function) {
        Integer in = function.apply(str);
        System.out.println(in);
    }

    public static void main(String[] args) {
        String st  = "123";
        conversion(st,(String str)->{
            return Integer.parseInt(str);
        });
    }
}
