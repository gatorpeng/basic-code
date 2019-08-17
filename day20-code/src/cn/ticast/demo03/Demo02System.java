package cn.ticast.demo03;

import java.util.Arrays;

public class Demo02System {
    public static void main(String[] args) {
        String str = "abc";
        str = "scbd";

        demo02();

    }

    private static void demo02() {
        int[] src = {1, 2, 3, 4, 5};
        int[] dest = {6, 7, 8, 9, 10};

        System.out.println("The dest before the arraycopy is:" + Arrays.toString(dest));

        System.arraycopy(src, 0, dest, 0, 4);
        System.out.println("The dest after the change is: " + Arrays.toString(dest));

    }

    private static void demo01() {
        long timeStart = System.currentTimeMillis();

        for (int i = 1; i < 10000; i++) {
            System.out.println(i);
        }

        long timeEnd = System.currentTimeMillis();

        long diff = timeEnd - timeStart;
        System.out.println(diff);
    }
}
