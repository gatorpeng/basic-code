package cn.itcast.day10.demo05;

public class Demo02Instanceof {
    public static void main(String[] args) {
        Animal animal = new Cat();
//        animal.eat();
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
        }

        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
        }

        getAPet(new Cat());
    }


    public static void getAPet(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.watchHouse();
        }

        if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
            cat.catchMouse();
        }
    }
}
