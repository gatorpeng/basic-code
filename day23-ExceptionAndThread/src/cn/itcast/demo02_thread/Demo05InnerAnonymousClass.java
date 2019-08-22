package cn.itcast.demo02_thread;

public class Demo05InnerAnonymousClass {
    public static void main(String[] args) {
        /*
        * method 1 to define a thread is to first create a child class of Thread
        * format: MyThread mt = new MyThread();
        * */
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName()+ "-->" + i);
                }

            }
        }.start();

        /*
        * method 2 to define a thread is to first create an implementation class
        * format: RunnableImpl impl = new RunnableImpl();
        *         new Thread(impl);
        * */
        Runnable impl = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName()+ "-->" + i);
                }
            }
        };
        new Thread(impl).start();

        // the third method
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println(Thread.currentThread().getName()+ "-->" + i);
                }
            }
        }).start();


    }
}
