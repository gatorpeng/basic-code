package cn.ticast.demo06.Generic;

public class GenericInterfaceImpl2<s> implements GenericInterface<s> {

    @Override
    public void method(s s) {
        System.out.println(s);
    }
}
