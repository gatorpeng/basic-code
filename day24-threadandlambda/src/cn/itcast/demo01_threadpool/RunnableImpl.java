package cn.itcast.demo01_threadpool;

public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +"has been created and implemented!!");
    }
}