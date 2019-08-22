package cn.itcast.demo07_wait_notify;


public class Demo01Test {
    public static void main(String[] args) {
        Object obj = new Object();

        new Thread() {
            @Override
            public void run() {
                while (true) {

                    System.out.println("01 Tell the dealer that you want to change engine oil");
                    synchronized (obj) {
                        try {
                            System.out.println("02 The oil change is underway......");
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        System.out.println("04 Let us go for a ride!");
                        System.out.println("================");
                    }
                }
            }
        }.start();


        new Thread() {
            @Override
            public void run() {
                while (true) {

                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    synchronized (obj) {
                        System.out.println("03 Tell the customer that the car is ready to go");
                        obj.notify();
                    }
                }
            }

        }.start();
    }
}
