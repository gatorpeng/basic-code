package cn.itcast.day06.demo03;

public class Demo01ArrayMax {
    public static void main(String[] args) {
        int[] array = new int[]{10, 20, 30, 100};
//        int[] array = {10,20,30,100};
        int max = getMax(array);
        System.out.println("max = " + max);
    }

    public static int getMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }


        }
        return max;
    }
}
