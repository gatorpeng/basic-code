package cn.itcast.demo02_map;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Demo02LinkedHashMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a","a");
        map.put("c","c");
        map.put("b","a");
        map.put("a","d");

        System.out.println(map);

        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("a","a");
        linkedHashMap.put("c","c");
        linkedHashMap.put("b","a");
        linkedHashMap.put("a","d");

        System.out.println(linkedHashMap);




    }
}
