package cn.itcast.day08.demo04;

public class Demo05Practice {
    public static void main(String[] args) {
        int[] array2 = {1,2,3,4,5};

        String str = fromArrayToString(array2);
        System.out.println(str);

    }

    public static String fromArrayToString(int[] array) {
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if (i == array.length-1) {
                str += "word" + array[i] + "]";
            } else {
                str += "word" + array[i] +"#";
            }
        }
        return str;
    }
}
