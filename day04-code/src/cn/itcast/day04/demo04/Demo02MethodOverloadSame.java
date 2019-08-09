package cn.itcast.day04.demo04;

public class Demo02MethodOverloadSame {

    public static void main(String[] args) {
        System.out.println("isSame = " + isSame(10,20));
        System.out.println("isSame = " + isSame((short) 10,(short) 20));
        System.out.println("isSame = " + isSame((byte) 10,(byte) 20));
        System.out.println("isSame = " + isSame( 10L, 20L));

    }

    public static boolean isSame(int x, int y) {

        System.out.println("Two integers");
        if (x == y) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isSame(short a, short b) {
        System.out.println("Two shorts");
        return a == b;
    }

    public static boolean isSame(byte a, byte b) {
        System.out.println("Two bytes");
        boolean same = a == b ? true : false;
        return same;
    }

    public static boolean isSame(long a, long b) {
        System.out.println("Two longs");
        boolean same;
        if (a == b) {
            same = true;
        } else {
            same = false;
        }
        return same;
    }

}
