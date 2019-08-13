package cn.itcast.day10.demo07;

/*
*  Access modifiers:     public    protected   (default)   private
* the same class:         yes       yes           yes       yes
* the same package:       yes       yes           yes       no
* the different package:  yes       yes           no        no
* the different package and no relationship:  yes no no     no
* */

public class DemoFinal {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1);

        num1 = 20;
        System.out.println(num1);

        final int num2 = 200;
        System.out.println(num2);

//        num2 = 300; incorrect statement

        Student stu1 = new Student("Julia Roberts");
        System.out.println(stu1.getName());
        System.out.println(stu1);

        stu1 = new Student("Brad Pitt");
        System.out.println(stu1.getName());
        System.out.println(stu1);

        final Student stu2 = new Student("Scarlett Johansson");
        System.out.println(stu2.getName());
        System.out.println(stu2);

        stu2.setName("George Clooney");
        System.out.println(stu2.getName());
        System.out.println(stu2);

        System.out.println("============");

        Person person = new Person();
        System.out.println("The name is:" + person.getName());




    }
}
