package cn.itcast.day07.demo02;

public class Demo01Anonymous {
    public static void main(String[] args) {
        Person pson = new Person();
        pson.name = "Ellie";
        pson.showName();

        new Person().name = "Derek";
        new Person().showName();

    }
}
