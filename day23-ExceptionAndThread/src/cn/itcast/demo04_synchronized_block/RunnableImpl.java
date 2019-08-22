package cn.itcast.demo04_synchronized_block;

public class RunnableImpl implements Runnable {
    private int numOfTicket =100;
    Object obj = new Object();


    @Override
    public void run() {
        while (true) {

            synchronized (obj) {
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
}
