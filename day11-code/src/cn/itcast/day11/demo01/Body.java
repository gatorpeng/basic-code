package cn.itcast.day11.demo01;

import org.w3c.dom.ls.LSOutput;

public class Body {

    public class Heart{
        public void methodHeart() {
            System.out.println("The name of the body is: " + name);
            System.out.println("The heart is beating");
        }
    }

    public void methodBody() {
        System.out.println("Method in the body");
        new Heart().methodHeart();
    }

    private String name;

    public Body() {
    }

    public Body(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
