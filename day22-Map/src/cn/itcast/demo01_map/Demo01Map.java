package cn.itcast.demo01_map;

import java.util.HashMap;
import java.util.Map;

public class Demo01Map {
    public static void main(String[] args) {
        show01();
    }

    private static void show01() {
        Map<String,Integer> map = new HashMap<>();
        map.put("Volvo",1967);
        map.put("Ford",1999);
        map.put("Toyota",1988);
        map.put("Mustang",2009);
        map.put("Honda",1988);
        Integer age1988 = map.put("Toyota", 1976);
        System.out.println(age1988);

        System.out.println(map);
        System.out.println("===========");

//        Integer age1 = map.remove("Volvo");
//        System.out.println(age1);


        map.remove("volvo");
        System.out.println(map);
        System.out.println("===========");

        Integer ageVolvo = map.get("Volvo");
        System.out.println(ageVolvo);

        boolean toyotaInclude = map.containsKey("Toyota");
        System.out.println(toyotaInclude);


    }
}
