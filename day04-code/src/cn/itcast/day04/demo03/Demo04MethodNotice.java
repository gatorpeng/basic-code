package cn.itcast.day04.demo03;

public class Demo04MethodNotice {
    public static void main(String[] args) {
        System.out.println("max(10 20) = " + getMax(10, 20));
    }

    public static int getMax(int a, int b){
        if (a>b) {
            return a;
        } else {
            return b;
        }
    }
}
