package cn.itcast.demo03_practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DemoStringCount {
    public static void main(String[] args) {
        System.out.println("Please input a string");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        Map<Character,Integer> map = new HashMap<>();

        for (char c : str.toCharArray()) {
            if (map.containsKey(c)) {
                Integer count = map.get(c);
                map.put(c,++count);
            } else {
                map.put(c,1);
            }
        }



        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> element : entries) {
            Character key = element.getKey();
            Integer value = element.getValue();
            System.out.println(key+"-->"+value);
        }
    }
}
