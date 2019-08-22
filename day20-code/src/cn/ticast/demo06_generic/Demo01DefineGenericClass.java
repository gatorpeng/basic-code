package cn.ticast.demo06_generic;

public class Demo01DefineGenericClass {
    public static void main(String[] args) {
        GenericClass gc = new GenericClass();
        gc.setName("Scarlett Johnasson");
        Object name = gc.getName();
        System.out.println(name);

        GenericClass<Integer> gc1 = new GenericClass<>();
        gc1.setName(1);
        Integer name1 = gc1.getName();
        System.out.println(name1);

        GenericClass<String> gc2 = new GenericClass<>();
        gc2.setName("George Clooney");
        String name2 = gc2.getName();
        System.out.println(name2);


    }
}
