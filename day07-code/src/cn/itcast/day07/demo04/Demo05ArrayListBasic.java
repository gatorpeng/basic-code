package cn.itcast.day07.demo04;

import java.util.ArrayList;

public class Demo05ArrayListBasic {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(0);
        list.add(555);
        list.add(8928);

        int num = list.get(3);
        System.out.println("第四个元素是：" +num);
    }
}
