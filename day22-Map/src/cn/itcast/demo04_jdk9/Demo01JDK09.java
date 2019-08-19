package cn.itcast.demo04_jdk9;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Demo01JDK09 {
    public static void main(String[] args) {

        List<String> list = List.of("Scarlett", "Julia", "Jennifer", "Angelina","Julia");
        System.out.println(list);

        Set<String> set = Set.of("Scarlett", "Julia", "Jennifer", "Angelina");
        System.out.println(set);

        Map<String, Integer> map = Map.of("Volvo", 2, "Ford", 3, "Toyota", 4);
        System.out.println(map);

    }
}
