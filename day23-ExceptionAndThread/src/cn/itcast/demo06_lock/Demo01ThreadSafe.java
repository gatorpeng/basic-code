package cn.itcast.demo06_lock;

public class Demo01ThreadSafe {
    public static void main(String[] args) {

        RunnableImpl run = new RunnableImpl();
//        System.out.println(run);
        new Thread(run).start();
        new Thread(run).start();
        new Thread(run).start();

    }
}
