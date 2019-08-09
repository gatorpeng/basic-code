package cn.itcast.day09.demo02;

public class Demo01Phone {
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.call();
        phone.text();
        phone.show();
        System.out.println("========");

        NewPhone phone1 = new NewPhone();
        phone1.call();
        phone1.text();
        phone1.show();

    }
}
