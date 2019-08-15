package cn.ticast.demo01;

public class Demo01ToString {

    public static void main(String[] args) {
        Person one =  new Person("Julia Roberts",30);
        Person two =  new Person("Julia Roberts",30);

        String str = one.toString();

        System.out.println(one);
        System.out.println(two);

        System.out.println(one.equals(two));


    }
}
