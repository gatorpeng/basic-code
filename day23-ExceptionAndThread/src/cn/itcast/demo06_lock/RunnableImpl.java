package cn.itcast.demo06_lock;

import java.util.concurrent.locks.ReentrantLock;

public class RunnableImpl implements Runnable {
    private static int numOfTicket = 100;
    ReentrantLock re = new ReentrantLock();
    //  synchronized method

    @Override
    public void run() {

//        System.out.println("this"+this);

        while (true) {
            re.lock();
            if (numOfTicket > 0) {
                try {
                    Thread.sleep(10);
                    System.out.println(Thread.currentThread().getName() +
                            "--> The " + numOfTicket + "th is sold.");
                    numOfTicket--;

                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    re.unlock();
                }


            }
        }
    }

}
