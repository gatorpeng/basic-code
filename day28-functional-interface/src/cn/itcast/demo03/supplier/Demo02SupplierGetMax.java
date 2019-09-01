package cn.itcast.demo03.supplier;

import java.util.function.Supplier;

public class Demo02SupplierGetMax {

    public static int getMax(Supplier<Integer> su) {
        return su.get();
    }

    public static void main(String[] args) {
        int[] arr = {100,400,888,-10,-500,400};

        int max = getMax(() -> {
            int m = arr[0];

            for (int i : arr) {
                if (i>m) {
                    m = i;
                }
            }

            return m;

        });

        System.out.println(max);
    }
}
