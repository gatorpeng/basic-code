package cn.ticast.demo06_generic;

public class GenericMethod {

    public <M> void method(M m) {
        System.out.println(m);
    }

    public static <S> void methodStatic(S s) {
        System.out.println(s);
    }
}
