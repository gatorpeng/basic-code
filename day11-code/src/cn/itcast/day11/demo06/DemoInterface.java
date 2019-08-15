package cn.itcast.day11.demo06;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DemoInterface {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<>();
        cars = addValue(cars);
        Collections.sort(cars);

        for (String i:cars) {
            System.out.println(i);

        }

    }

    public static List<String> addValue(List cars) {
        cars.add("Volvo");
        cars.add("Ford");
        cars.add("Toyota");
        cars.add("Honda");
        return cars;
    }
 }
