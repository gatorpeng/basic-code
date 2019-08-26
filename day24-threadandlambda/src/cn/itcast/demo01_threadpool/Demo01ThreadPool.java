package cn.itcast.demo01_threadpool;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo01ThreadPool {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(2);
        es.submit(new RunnableImpl()); // create the first thread
        es.submit(new RunnableImpl()); // create the second thread
    }
}
