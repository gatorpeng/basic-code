package cn.ticast.demo06.Generic;

public class GenericMethod {

    public <M> void method(M m) {
        System.out.println(m);
    }

    public static <S> void methodStatic(S s) {
        System.out.println(s);
    }
}
