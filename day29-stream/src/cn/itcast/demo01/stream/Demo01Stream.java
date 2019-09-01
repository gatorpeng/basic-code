package cn.itcast.demo01.stream;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;

public class Demo01Stream {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Scarlett");
        list.add("Steve");
        list.add("Adam");
        list.add("Hugh");
        list.add("Stella");
        list.add("Apple");

        // First do filtering to get the name starting with "s"
        // Then filter out the name with a lenght of less than 5
        // Lastly, print out the stream

        list.stream().
                filter(s->s.startsWith("S")).
                filter(s->s.length()>5).
                forEach(s-> System.out.println(s));
    }
}
