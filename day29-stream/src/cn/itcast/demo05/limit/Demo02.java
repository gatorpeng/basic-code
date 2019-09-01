package cn.itcast.demo05.limit;

import java.util.stream.Stream;

public class Demo02 {

    public static void main(String[] args) {
        Stream<String> sub = Stream.of("how", "to", "do", "in", "java").limit(3);
        sub.forEach(element-> System.out.println(element));
    }

}
