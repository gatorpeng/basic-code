package cn.itcast.day09.demo07;

import java.util.ArrayList;

public class Demo01HandOutBonus {
    public static void main(String[] args) {

        Manager manager = new Manager("manager",100);
        manager.show();
        System.out.println("================");

        Member memberA = new Member("memberA",30);
        memberA.show();
        System.out.println("================");

        Member memberB = new Member("memberB",40);
        memberB.show();
        System.out.println("================");

        Member memberC = new Member("memberC",50);
        memberC.show();
        System.out.println("================");
        System.out.println("Hands out bonus.");

        ArrayList<Integer> redList = manager.sendMoney(98,3);
        manager.show();

        memberA.receiveMoney(redList);
        memberA.show();

        memberB.receiveMoney(redList);
        memberB.show();

        memberC.receiveMoney(redList);
        memberC.show();
    }

}
