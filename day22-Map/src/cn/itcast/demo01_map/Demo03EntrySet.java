package cn.itcast.demo01_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo03EntrySet {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("Ford",1999);
        map.put("Toyota",1988);
        map.put("Mustang",2009);
        map.put("Honda",1988);

        Set<Map.Entry<String, Integer>> set = map.entrySet();

        // iterator
       /* Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> element = it.next();
            String key = element.getKey();
            Integer value = element.getValue();
            System.out.println(key + "-" +value);
        }*/

       // advanced for loop
        for (Map.Entry<String, Integer> entry : set) {
            Integer value = entry.getValue();
            String key = entry.getKey();
            System.out.println(key+"-"+value);
        }


    }
}
