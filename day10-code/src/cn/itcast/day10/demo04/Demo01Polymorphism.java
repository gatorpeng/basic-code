package cn.itcast.day10.demo04;


/*
* when the parent class does not include a method in the
* */

// polymorphism
public class Demo01Polymorphism {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.method();
        obj.methodParent();

        System.out.println(obj.num);

        obj.show();

    }

}
