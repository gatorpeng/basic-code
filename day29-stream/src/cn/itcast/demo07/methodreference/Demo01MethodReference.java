package cn.itcast.demo07.methodreference;

public class Demo01MethodReference {
    public static void methodPrintable(Printable p){
        p.print("Hello world");
    }

    public static void main(String[] args) {
        //overwrite the abstract method using an inner anonymous class
        methodPrintable(new Printable() {
            @Override
            public void print(String s) {
                System.out.println(s);
            }
        });

        // lambda expression
        methodPrintable(s -> System.out.println(s));

        // method reference
        methodPrintable(System.out::println);
    }
}
