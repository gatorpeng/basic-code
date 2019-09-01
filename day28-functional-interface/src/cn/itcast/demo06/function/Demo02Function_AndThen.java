package cn.itcast.demo06.function;

import java.util.function.Function;

public class Demo02Function_AndThen {
    public static void stringConversion(String str, Function<String, Integer> fun1, Function<Integer, String> fun2 ){
        String s = fun1.andThen(fun2).apply(str);
        System.out.println(s);
    }

    public static void main(String[] args) {
        String s = "1235";

        /*stringConversion(s,(String st)->{return Integer.parseInt(st)+10;},
                (Integer in)->{return in+"";});*/

        stringConversion(s,st->Integer.parseInt(st)+10,in->in+"");
    }
}
