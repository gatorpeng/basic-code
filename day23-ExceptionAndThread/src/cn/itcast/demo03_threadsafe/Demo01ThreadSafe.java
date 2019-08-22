package cn.itcast.demo03_threadsafe;

public class Demo01ThreadSafe {
    public static void main(String[] args) {

        RunnableImpl run = new RunnableImpl();


        new Thread(run).start();
        new Thread(run).start();
        new Thread(run).start();


    }
}
