package cn.itcast.demo01_threadpool;

public class Demo02Lambda {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"has been created.");
            }
        }).start();

        // lambda expression
        new Thread(() -> {
            System.out.println(Thread.currentThread().getName() + "has been created.");
        }).start();

    }
}
