package cn.itcast.day07.demo04;

import java.util.ArrayList;

public class Demo03ArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        boolean success = list.add("迪丽热巴");
        System.out.println("添加是否成功： " + success);

        list.add("古力娜扎");
        list.add("马尔扎哈");
        list.add("哈哈哈哈");

        System.out.println("第二人的名字是：" +list.get(1));

        String removedName = list.remove(3);
        System.out.println("被删除的人是：" + removedName);
        System.out.println(list);
        System.out.println("the size of the array list is: " + list.size());

    }
}
