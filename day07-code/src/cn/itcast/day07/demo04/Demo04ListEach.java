package cn.itcast.day07.demo04;

import java.util.ArrayList;

public class Demo04ListEach {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("迪丽热巴");
        list.add("古力娜扎");
        list.add("马尔扎哈");

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
