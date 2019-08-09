package cn.itcast.day07.demo05;

import java.util.ArrayList;

public class Demo03ArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("迪丽热巴");
        list.add("马尔扎哈");
        list.add("古力娜扎");
        list.add("屋里啦啦");

        System.out.println(list);
        arrayListPrint(list);

    }

    public static void arrayListPrint(ArrayList<String> list) {

        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {

            if (i==list.size()-1) {
                System.out.println(list.get(i) +"}");
            } else {
                System.out.print(list.get(i) + "@");
            }

        }
    }

}
