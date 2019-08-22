package cn.itcast.demo02_thread;

public class Demo03Sleep {
    public static void main(String[] args) {
        for (int i = 1; i < 20; i++) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
