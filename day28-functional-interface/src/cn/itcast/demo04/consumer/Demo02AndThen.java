package cn.itcast.demo04.consumer;

import java.util.function.Consumer;

public class Demo02AndThen {
    public static void menthod(String st, Consumer<String> con1, Consumer<String> con2) {
        con1.andThen(con2).accept(st);
    }

    public static void main(String[] args) {
        String st = "Hello";

        menthod(st,
                (t) -> {
                    System.out.println(t.toUpperCase());
                },
                (t) -> {
                    System.out.println(t.toLowerCase());
                });
    }
}
