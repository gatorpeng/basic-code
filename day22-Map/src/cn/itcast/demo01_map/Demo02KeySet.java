package cn.itcast.demo01_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo02KeySet {
    public static void main(String[] args) {
        // the first method to traverse the map
        Map<String,Integer> map = new HashMap<>();
        map.put("Ford",1999);
        map.put("Toyota",1988);
        map.put("Mustang",2009);
        map.put("Honda",1988);

        System.out.println(map);

        Set<String> str = map.keySet();

       /* for (String s : str) {

            System.out.println(map.get(s));
        }*/

        Iterator<String> iterator = str.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            System.out.println(map.get(next));
        }


    }
}
