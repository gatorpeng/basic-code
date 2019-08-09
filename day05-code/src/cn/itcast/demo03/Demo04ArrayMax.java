package cn.itcast.demo03;

public class Demo04ArrayMax {
    public static void main(String[] args) {

        int[] arrayB = new int[] {10, 20, 30, 40};
        int maxB  = getMax(arrayB);
        System.out.println("The max value of arrayB is " + maxB);

    }

    public static int getMax(int[] array) {
        int max = array[1];
        for (int i = 0; i < array.length; i++) {
            if (max<array[i]) {
                max = array[i];
            }
        }
        return max;
    }

}
