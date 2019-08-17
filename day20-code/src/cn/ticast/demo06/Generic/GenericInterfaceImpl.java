package cn.ticast.demo06.Generic;

public class GenericInterfaceImpl<String> implements GenericInterface<String> {
    @Override
    public void method(String string) {
        System.out.println(string);
    }
}
