package cn.itcast.demo02_lambda;

public class Demo03LambdaCalculator {
    public static void main(String[] args) {
        invokeCalculator(10, 20, new Calculator() {
            @Override
            public int calc(int a, int b) {
                return a + b;
            }
        });

        invokeCalculator(30, 900, (int a, int b) -> {
            return a + b;
        });

    }

    public static void invokeCalculator(int a, int b, Calculator c) {
        int sum = c.calc(a, b);
        System.out.println(sum);
    }
}
