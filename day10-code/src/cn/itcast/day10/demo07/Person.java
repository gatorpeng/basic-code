package cn.itcast.day10.demo07;

public class Person {
    private final String name;

    public Person() {
        name = "Scarlett Johnasson";
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }
}
