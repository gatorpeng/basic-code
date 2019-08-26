package cn.itcast.demo02_recursion;

public class Demo03Recursion {
    public static void main(String[] args) {
        int product = factorial(5);
        System.out.println(product);
    }

    public static int factorial(int n) {
        if (n==1) {
            return 1;
        }
        return n*factorial(n-1);
    }
}
