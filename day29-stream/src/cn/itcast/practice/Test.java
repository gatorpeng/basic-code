package cn.itcast.practice;

import java.util.ArrayList;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("迪丽热巴");
        list1.add("宋远桥");
        list1.add("苏星河");
        list1.add("石破天");
        list1.add("君子");
        list1.add("老子");
        list1.add("洪七公");
        Stream<String> stream1 = list1.stream().filter(s -> s.length() == 3).limit(3);


        ArrayList<String> list2 = new ArrayList<>();
        list2.add("古力娜扎");
        list2.add("张无忌");
        list2.add("张三丰");
        list2.add("赵四");
        list2.add("张天爱");
        list2.add("张二狗");
        Stream<String> stream2 = list2.stream().filter(s -> s.startsWith("张")).skip(2);

        /*ArrayList<Person> list3 = new ArrayList<>();

        Stream.concat(stream1,stream2).forEach(name->list3.add(new Person(name)));

        for (Person person : list3) {
            System.out.println(person);
        }*/

        Stream.concat(stream1,stream2).map(name -> new Person(name)).forEach(p-> System.out.println(p));
    }
}
