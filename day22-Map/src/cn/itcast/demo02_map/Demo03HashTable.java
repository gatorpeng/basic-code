package cn.itcast.demo02_map;

/*
 * HashTable (single thread) and Vector are replaced by HashMap (multiple threading)and ArrayList separately.
 * HashTable does not allow for null key or null values
 * */

import java.util.HashMap;
import java.util.Hashtable;

public class Demo03HashTable {
    public static void main(String[] args) {

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put(null, "a");
        hashMap.put("c", "d");
        hashMap.put("d", "e");
        hashMap.put(null, null);
        System.out.println(hashMap);

        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put(null,"a");
    }
}
