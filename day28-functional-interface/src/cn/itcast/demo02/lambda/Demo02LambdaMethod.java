package cn.itcast.demo02.lambda;

public class Demo02LambdaMethod {
    public static void startThread(Runnable run) {
        new Thread(run).start();
    }

    public static void main(String[] args) {

        startThread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+" is launching.");
            }
        });

        startThread(()->{
            System.out.println(Thread.currentThread().getName()+" is starting.");
        });

    }


}
