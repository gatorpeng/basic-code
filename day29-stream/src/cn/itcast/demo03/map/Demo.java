package cn.itcast.demo03.map;

import java.util.stream.Stream;

/*
* apply(T)
*
* Function<String, Integer> {
* fun.apply(st)}

* */

public class Demo {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4");
        Stream<Integer> stream1 = stream.map(s->Integer.parseInt(s));

        stream1.forEach(s-> System.out.println(s));

    }
}
