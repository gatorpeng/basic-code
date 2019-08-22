package cn.itcast.demo05_synchronized_method;

public class Demo01ThreadSafe {
    public static void main(String[] args) {

        RunnableImpl run = new RunnableImpl();
//        System.out.println(run);
        new Thread(run).start();
        new Thread(run).start();
        new Thread(run).start();

    }
}
