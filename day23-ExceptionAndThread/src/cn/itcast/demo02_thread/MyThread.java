package cn.itcast.demo02_thread;

public class MyThread extends Thread {

    /*public void run() {
        for (int i = 0; i <20; i++) {
            System.out.println("run" + i);
        }
    }*/

    @Override
    public void run() {
        /*String s = getName();
        System.out.println(s);*/

        System.out.println(Thread.currentThread().getName());
    }
}
