package cn.itcast.demo02_thread.setname;

public class DemoSetName {
    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.setName("Volvo");
        mt.start();

        new MyThread("Ford").start();


    }
}
