package cn.ticast.demo06_generic;

public class Demo03GenericInterface {
    public static void main(String[] args) {
        GenericInterfaceImpl gii = new GenericInterfaceImpl();
        gii.method("Leonardo dicaprio");

        GenericInterfaceImpl2<Integer> gii2 = new GenericInterfaceImpl2<Integer>();
        gii2.method(300);
    }
}
