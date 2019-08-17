package cn.ticast.demo05;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/*
* collection.remove()
* collection.add()
* collection.isEmpty();
* collection.clear;
* collection.toArray();
* collection.size();
* */

public class Demo01Collection {
    public static void main(String[] args) {
        Collection coll = new HashSet();
        System.out.println(coll);
        System.out.println("is empty or not: "+coll.isEmpty());
        System.out.println("=======================");

        coll.add("Volvo");
        coll.add("Toyota");
        coll.add("Ford");
        coll.add("QQ");
        coll.add("Honda");

        System.out.println("The list contains Volvo: " + coll.contains("Volvo"));

        int size = coll.size();
        System.out.println("The size of the array: " +size);

        coll.remove("QQ");
        Object[] obj = coll.toArray();
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }

        coll.clear();
        System.out.println("the array is empty: "+ coll.isEmpty());



    }
}
