package cn.ticast.demo06.Generic;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo02GenericMethod {
    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        gm.method("Angelina Jolie");

        GenericMethod.methodStatic("Brad Pitt");
    }
}
