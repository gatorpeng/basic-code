package cn.itcast.demo08_practice;

public class Customer extends Thread {
    private Dumpling bozi;

    public Customer(Dumpling bozi) {
        this.bozi = bozi;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (bozi) {
                if (bozi.flag==false) {
                    try {
                        bozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    System.out.println("The customer is eating the dumpling... ");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("Finished. Next Customer!");
                    System.out.println("==========================");
                    bozi.flag = false;
                    bozi.notify();
                }
            }
        }
    }
}
