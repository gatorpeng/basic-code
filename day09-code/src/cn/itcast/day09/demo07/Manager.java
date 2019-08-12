package cn.itcast.day09.demo07;

import java.util.ArrayList;
import java.util.Arrays;

public class Manager extends User {

    public Manager() {
    }

    public Manager(String name, int balance) {
        super(name, balance);
    }

    public ArrayList<Integer> sendMoney(int moneyToSend, int count) {
        ArrayList<Integer> list = new ArrayList<>();
        if (moneyToSend > super.getBalance()) {
            System.out.println("The balance is not sufficient. ");
        } else {

            int moneyPerPerson = moneyToSend / count;
            int residue = moneyToSend % count;

            for (int i = 0; i < count - 1; i++) {
                list.add(moneyPerPerson);
            }

            int last = moneyPerPerson + residue;
            System.out.println("residue = " + residue + "; last = " + last);
            list.add(last);
            super.setBalance(super.getBalance() - moneyToSend);
        }

        System.out.println(Arrays.toString(list.toArray()));
        return list;


    }


}
