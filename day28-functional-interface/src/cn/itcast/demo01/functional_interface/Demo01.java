package cn.itcast.demo01.functional_interface;

public class Demo01 {
    public static void show(MyFunctionalInterface myFunctionalInterface) {
        myFunctionalInterface.method();
    }

    public static void main(String[] args) {
        // method 1: implementation of the interface
        show(new MyFunctionalInterfaceImpl());

        // method 2: inner anonymous class
        show(new MyFunctionalInterface() {
            @Override
            public void method() {
                System.out.println("Inner anonymous");
            }
        });

        // method 3: Lambda expression
        show(() -> System.out.println("Lambda Expression"));

    }
}
