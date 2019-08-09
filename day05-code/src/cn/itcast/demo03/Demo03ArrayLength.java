package cn.itcast.demo03;

public class Demo03ArrayLength {
    public static void main(String[] args) {
        int[] arrayA = new int[3];

        int[] arrayB = new int[] {10, 20, 30, 40};

        int[] arrayC = {10, 60, 70, 90};

        int len = arrayA.length;

        System.out.println("The length of the array A is " +len);

        int[] arrayD = new int[3];
        System.out.println("The length is" + arrayD.length);

        arrayD  = new int[5];
        System.out.println("The length is" + arrayD.length);

        for (int i = 0; i < arrayC.length; i++) {
            System.out.println(arrayC[i]);
        }
    }

}
