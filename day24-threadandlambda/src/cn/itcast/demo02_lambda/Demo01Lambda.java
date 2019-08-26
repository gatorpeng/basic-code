package cn.itcast.demo02_lambda;

public class Demo01Lambda {
    public static void main(String[] args) {
        invokeCook(new Cook() {
            @Override
            public void makeFood() {
                System.out.println("The food is ready for dinner.");
            }
        });

        invokeCook(()->{
                System.out.println("The food is ready for dinner.");
            });
    }

    public static void invokeCook(Cook cook) {
        cook.makeFood();
    }
}
