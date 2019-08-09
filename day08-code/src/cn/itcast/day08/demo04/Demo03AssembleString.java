package cn.itcast.day08.demo04;

public class Demo03AssembleString {
    public static void main(String[] args) {
        String[] str  = {"Elbert","Ellie", "Derek"};
        stringAssemble(str);

        int[] str1 = {1,2,3};
        String str2 = str1.toString();

    }

    public static void stringAssemble(String[] list) {

        System.out.print("[");
        for (int i = 0; i < list.length; i++) {
            if (i==list.length-1) {
                System.out.println(list[i] +"]");
            } else {
                System.out.print(list[i]+"#");
            }
        }
        System.out.println("Print is completed");
    }

}
