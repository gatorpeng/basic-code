package cn.itcast.demo02_thread;
/*
* The first method to create a thread is to create a child class of Thread and override the method run()
* The second method to create a thread is to use runnable (interface);
* */
public class Demo04CreateThread {
    public static void main(String[] args) {

        RunnableImpl runImpl = new RunnableImpl();
        Thread thread01  = new Thread(runImpl);
        thread01.start();

        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName() + "-->" +i);
        }


    }
}
