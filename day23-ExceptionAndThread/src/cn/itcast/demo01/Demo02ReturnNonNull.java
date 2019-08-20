package cn.itcast.demo01;

import java.util.Objects;

public class Demo02ReturnNonNull {
    public static void main(String[] args) {
        Object obj = null;
        method(obj);
        System.out.println(obj);
    }

    public static void method(Object obj){

        if (obj==null) {
            throw new NullPointerException("The input is null");
        }

//        Objects.requireNonNull(obj,"The input is null");
    }
}
