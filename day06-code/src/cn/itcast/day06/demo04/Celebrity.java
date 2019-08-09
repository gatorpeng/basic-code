package cn.itcast.day06.demo04;

import java.sql.SQLOutput;

public class Celebrity {

    private String name;
    private int age;

    public Celebrity() {
        System.out.println("无参数构造方法执行了!!!");
    }

    public Celebrity(int age, String name) {
        System.out.println("有参构造方法执行了！");
        this.age = age;
        this.name = name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}
