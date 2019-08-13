package cn.itcast.day11.demo01;

public class Demo01InnerClass {
    public static void main(String[] args) {
//        indirect call
        Body body = new Body("Derek");
        body.methodBody();

//        direct call
        Body.Heart hrt = new Body("Elbert").new Heart();
        hrt.methodHeart();
    }
}
