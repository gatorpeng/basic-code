package cn.itcast.day06.demo03;

public class Student {
    private String name;
    private boolean male;
    private int age;

    public void setName(String nm) {
        name = nm;
    }

    public String getName() {
        return name;
    }

    public void setMale(Boolean is) {
        male = is;
    }

    public Boolean isMale() {
        return male;
    }

    public void setAge(int num) {
        age = num;
    }

    public int getAge() {
        return age;
    }
}
