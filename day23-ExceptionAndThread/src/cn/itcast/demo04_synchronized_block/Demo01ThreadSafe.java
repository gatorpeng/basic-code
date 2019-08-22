package cn.itcast.demo04_synchronized_block;

public class Demo01ThreadSafe {
    public static void main(String[] args) {

        long timeTic = System.currentTimeMillis();

        RunnableImpl run = new RunnableImpl();
        new Thread(run).start();
        new Thread(run).start();
        new Thread(run).start();

        long timeToc = System.currentTimeMillis();

        System.out.println((timeToc-timeTic)/1000 + " second");


    }
}
