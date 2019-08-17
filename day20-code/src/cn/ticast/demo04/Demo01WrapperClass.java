package cn.ticast.demo04;

import java.util.ArrayList;

public class Demo01WrapperClass {
    public static void main(String[] args) {

//       Boxing
        Integer one = new Integer(1);
        Integer two = new Integer("2");
        System.out.println("one: " + one);
        System.out.println("two: " + two);
        Integer three = Integer.valueOf(2);
        System.out.println("three：" + three);


//        unboxing

        int int1 = one.intValue();
        System.out.println(int1);

        one = one +3;

        System.out.println(one);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        int int2 = list.get(0);
        System.out.println("int2:" + int2);

    }
}
