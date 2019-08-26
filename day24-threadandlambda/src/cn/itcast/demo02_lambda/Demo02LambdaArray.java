package cn.itcast.demo02_lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Demo02LambdaArray {
    public static void main(String[] args) {
        Person[] arr =  {
                new Person("Jennifer Aniston",42),
                new Person("Julia Roberts",40),
                new Person("Scarlett Johansson",30)
        };

        // method 1: anonymous inner class
        Arrays.sort(arr, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });

        // lambda expression

        Arrays.sort(arr,(Person o1, Person o2) ->{
            return o1.getAge()-o2.getAge();
        });
        for (Person person : arr) {
            System.out.println(person);
        }


    }
}
