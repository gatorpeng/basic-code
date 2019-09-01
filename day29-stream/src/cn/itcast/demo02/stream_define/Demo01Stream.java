package cn.itcast.demo02.stream_define;

import java.util.*;
import java.util.stream.Stream;

public class Demo01Stream {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();

        Set<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        HashMap<Integer, String> map = new HashMap<>();
        Set<Integer> keySet = map.keySet();
        Stream<Integer> stream3 = keySet.stream();
        Collection<String> values = map.values();
        Stream<String> stream4 = values.stream();
        Set<Map.Entry<Integer, String>> entries = map.entrySet();
        Stream<Map.Entry<Integer, String>> stream5 = entries.stream();

        int[] arr = {1, 2, 3, 4};
        Stream<int[]> stream6 = Stream.of(arr);
        String[] str = {"a", "c", "b", "d"};
        Stream<String> stream7 = Stream.of(str);

    }
}
