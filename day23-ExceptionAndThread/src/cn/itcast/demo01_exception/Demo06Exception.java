package cn.itcast.demo01_exception;

import java.util.List;

public class Demo06Exception {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        List<String> list = List.of("a", "b", "c");

        /*int i = array[4];
        String s = list.get(3);*/

        /*//method 1:
        try {
            int i = array[4]; // ArrayIndexOutOfBound()
            System.out.println(i);
        } catch(IndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }

        try {
            String s = list.get(3);// ArrayIndexOutOfBoundsException()
            System.out.println(s);
        } catch(IndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
*/
        //method 2: try once and catch several times

        /*try {
//            int i = array[4]; // ArrayIndexOutOfBound()
//            System.out.println(i);

            String s = list.get(3);// ArrayIndexOutOfBoundsException()
            System.out.println(s);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }*/


        //method 3: try once and catch once

        try {
            int i = array[4]; // ArrayIndexOutOfBound()
            String s = list.get(3);// ArrayIndexOutOfBoundsException()
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }

        System.out.println("THe rest of the code is executed");

    }
}
