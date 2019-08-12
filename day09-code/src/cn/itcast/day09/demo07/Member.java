package cn.itcast.day09.demo07;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {
    }

    public Member(String name, int balance) {
        super(name, balance);
    }

    public void receiveMoney(ArrayList<Integer> list) {

        if (list.isEmpty()) {

        } else {
            Random rdm = new Random();
            int index = rdm.nextInt(list.size());
            super.setBalance(list.get(index)+super.getBalance());
            list.remove(index);
        }

    }
}
