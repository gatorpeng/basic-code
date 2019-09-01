package cn.itcast.demo04.count;

import java.util.ArrayList;
import java.util.stream.Stream;

public class DemoCount {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Stream<Integer> stream = list.stream();
        long count = stream.count();
        System.out.println(count);

        System.out.println("===========");


        long count1 = Stream.of("how","to","do","in","java").count();
        System.out.printf("There are %d elements in the stream %n", count1);
    }
}
