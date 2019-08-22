package cn.ticast.demo06_generic;

public class Demo02GenericMethod {
    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        gm.method("Angelina Jolie");

        GenericMethod.methodStatic("Brad Pitt");
    }
}
