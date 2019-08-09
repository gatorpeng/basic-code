package cn.itcast.demo04;

public class Demo01ArrayParam {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};

        System.out.println(array);
        printArray(array);
        System.out.println("=====aaa======");
        printArray(array);
        System.out.println("=====bbb======");
    }



    public static void printArray(int[] array) {
        System.out.println("The address the PrintArray received is :" + array);
        for (int i = 0; i < array.length-1; i++) {
            System.out.println(array[i]);
        }
    }

}
