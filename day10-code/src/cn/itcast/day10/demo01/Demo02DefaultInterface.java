package cn.itcast.day10.demo01;

/*
*fdafsdfsd
* dfafd
* */


public class Demo02DefaultInterface {
    public static void main(String[] args) {

        MyInterfaceDefaultImplA implA = new MyInterfaceDefaultImplA();
        implA.methodAbs1();
        implA.methodDefault();
        System.out.println("==============");

        MyInterfaceDefaultImplB implB = new MyInterfaceDefaultImplB();
        implB.methodAbs1();
        implB.methodDefault();
    }
}
