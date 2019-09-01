package cn.itcast.demo08.objectmethodreference;

public class Demo01Test {
    public static void methodReference(Printable p){
        p.print("Hello World");
    }

    public static void main(String[] args) {
        methodReference(st->{
            PrintUpperCase obj = new PrintUpperCase();
            obj.printUpperCase(st);
        });

        System.out.println("==========");
        methodReference(PrintUpperCase::printUpperCase);
    }
}
