package cn.itcast.demo06.skip;

import java.util.stream.Stream;

public class Demo01Skip {
    public static void main(String[] args) {
        Stream<String> sub = Stream.of("how", "to", "do", "in", "java").skip(2);
        sub.forEach(element-> System.out.println(element));
    }
}
