package cn.itcast.demo08_practice;

public class Manufacturer extends Thread {
    private Dumpling bozi;

    public Manufacturer(Dumpling bozi) {
        this.bozi = bozi;
    }

    @Override
    public void run() {
        int count =0;

        while (true) {
            synchronized (bozi) {
                if (bozi.flag==true) {
                    System.out.println("The dumpling is available.");
                    try {
                        bozi.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                } else {
                    if (count%2==0) {
                        bozi.wrapper = "thin";
                        bozi.stuffing = "chicken";
                    } else {
                        bozi.wrapper = "thick";
                        bozi.stuffing = "beef";
                    }
                    count++;
                    System.out.println("The manufacturer is producing the dumplings (wrapper: " + bozi.wrapper+
                            "; stuffing: " + bozi.stuffing + ")...");

                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    bozi.flag = true;
                    System.out.println("The dumpling is ready.");
                    bozi.notify();
                }


            }
        }
    }
}
