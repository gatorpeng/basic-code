package cn.itcast.demo01.stream;

public class ReverseInteger {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(reverseInt(1234567892));
        System.out.println(reverseInt(1234567891));
    }

    private static int reverseInt(int x) {
        int currentDigit;
        long result = 0;
        while (x != 0) {
            currentDigit = x % 10;
            result = result * 10 + currentDigit;
            x /= 10;
        }
        if(result > 2147483647 || result < -2147483648){
            return 0;
        } else {
            return (int) result;
        }
    }
}
