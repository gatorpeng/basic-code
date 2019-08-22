package cn.itcast.demo05_synchronized_method;

public class RunnableImpl implements Runnable {
    private static int numOfTicket = 100;
    Object obj = new Object();

    //  synchronized method

    @Override
    public void run() {
//        System.out.println("this"+this);
        while (true) {
            sellTicket();
        }
    }

    public static synchronized void sellTicket() {
        if (numOfTicket > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() +
                    "--> The " + numOfTicket + "th is sold.");
            numOfTicket--;
        }
    }
}
