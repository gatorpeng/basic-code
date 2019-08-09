package cn.itcast.day07.demo04;

public class Demo01Array {
    public static void main(String[] args) {
        Person[] array = new Person[3];
        Person one = new Person(2,"Elbert");
        Person two = new Person(32,"Ellie");
        Person three= new Person(35,"Derek");

        array[0] = one;
        array[1] = two;
        array[2] = three;

        System.out.println(array[0].getName() + array[0].getAge());
        System.out.println(array[1].getName() + array[1].getAge());
        System.out.println(array[2].getName() + array[2].getAge());

    }
}
