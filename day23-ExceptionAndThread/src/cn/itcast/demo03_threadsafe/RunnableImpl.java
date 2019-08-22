package cn.itcast.demo03_threadsafe;

public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        int numOfTicket =100;
        while (true) {
            if (numOfTicket >0) {
                System.out.println("The " + numOfTicket+ "th is sold.");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                numOfTicket--;
            }
        }
    }
}
