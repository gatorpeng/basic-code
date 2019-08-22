package cn.itcast.demo02_thread;

public class Demo06MainThread {
    public static void main(String[] args) {

        Person p01 = new Person("Scarlett Johansson");
        p01.run();
        System.out.println(0/0);

        Person p02 = new Person("Jennifer Aniston");
        p02.run();



    }
}
