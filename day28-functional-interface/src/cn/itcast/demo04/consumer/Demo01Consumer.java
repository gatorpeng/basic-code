package cn.itcast.demo04.consumer;

import java.util.function.Consumer;

public class Demo01Consumer {

    public static void stringReverse(String st, Consumer<String> con) {
        con.accept(st);
    }

    public static void main(String[] args) {
        String str = "ABCDF";
        stringReverse(str,(String name)->{
            String string = new StringBuffer(name).reverse().toString();
            System.out.println(string);
        });

        System.out.println("========");
        System.out.println(str);
    }
}
