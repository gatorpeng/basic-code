package cn.itcast.demo02_thread;

public class Demo01ThreadPrint {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();


        for (int i = 0; i < 20; i++) {
            System.out.println("main" + i);
        }
    }
}
