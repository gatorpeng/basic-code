package cn.itcast.day07.demo06;

public class Student {
    private int id;
    private int age;
    private String name;
    static String room;
    static int idCounter = 0;


    public Student() {
        this.id = ++idCounter;
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
        this.id = ++idCounter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
