package cn.itcast.day10.demo07;

public final class Student {

    private String name;

    public final void show() {
        System.out.println("This is a final method in this class");
    }

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
