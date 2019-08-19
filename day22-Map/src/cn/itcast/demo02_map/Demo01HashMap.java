package cn.itcast.demo02_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo01HashMap {

    public static void main(String[] args) {

        Person one = new Person("Scarlett Johansson",28);
        Person two = new Person("Hugh Grant",50);
        Person three = new Person("Bruce Lee",58);
        Person four = new Person("Scarlett Johansson",28);

//        show01(one,two,three,four);
        show02(one,two,three,four);

    }

    private static void show02(Person one, Person two, Person three, Person four) {
        Map<Person, String> map = new HashMap<>();
        map.put(one,"US");
        map.put(two,"England");
        map.put(three,"China");
        map.put(four,"Japan");

        System.out.println(map);
        System.out.println("================");

        Set<Map.Entry<Person, String>> set = map.entrySet();
        for (Map.Entry<Person, String> element : set) {
            Person key = element.getKey();
            String value = element.getValue();

            System.out.println(key + "-->" +value);

        }


    }

    private static void show01(Person one, Person two, Person three, Person four) {
        Map<String, Person> map = new HashMap<>();
        map.put("US",one);
        map.put("England",two);
        map.put("China",three);
        map.put("Japan",four);

        System.out.println(map);
        System.out.println("================");

        Set<String> set = map.keySet();
        for (String key : set) {
            Person value = map.get(key);
            System.out.println(key + "-->" + value);
        }

    }
}
