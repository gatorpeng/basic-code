package cn.itcast.demo01;

public class Demo01Throw {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int e = getElement(arr, 5);
        System.out.println(e);
    }

    public static int getElement(int[] arr, int index) {
        if (arr==null) {
            throw new NullPointerException("The integer array is null");
        }

        if (index>arr.length-1 || index<0) {
            throw new ArrayIndexOutOfBoundsException("the index exceeds the length of the array.");
        }

        int ele = arr[index];
        return ele;

    }

}
