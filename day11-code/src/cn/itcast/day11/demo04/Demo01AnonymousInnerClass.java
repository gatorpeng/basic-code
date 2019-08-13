package cn.itcast.day11.demo04;

public class Demo01AnonymousInnerClass {
    public static void main(String[] args) {
        MyInterface obj_impl = new MyInterfaceImpl();
        obj_impl.methodInterface1();
        obj_impl.methodInterface2();

        System.out.println("==================");


        MyInterface obj = new MyInterface() {

            @Override
            public void methodInterface1() {
                System.out.println("Method 1 in the anonymous inner class");
            }

            @Override
            public void methodInterface2() {
                System.out.println("Method 2 in the anonymous inner class");
            }
        };
        obj.methodInterface1();
        obj.methodInterface2();
    }
}
