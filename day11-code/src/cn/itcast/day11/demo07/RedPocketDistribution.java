package cn.itcast.day11.demo07;

import java.util.ArrayList;
import java.util.Random;

public class RedPocketDistribution implements OpenMode {

    @Override
    public ArrayList<Integer> normalRed(final int moneyToSend, final int count) {

        ArrayList<Integer> list = new ArrayList<>();
        int avg = moneyToSend / count;
        int mod = moneyToSend % count;

        for (int i = 0; i <count-1;i++) {
            list.add(avg);
        }

        list.add(avg+mod);

        return list;
    }

    @Override
    public ArrayList<Integer> randomRed(final int moneyToSend, final int count) {
        Random rdnm = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        int leftMoney = moneyToSend;
        int leftCount = count;

        for (int i = 0; i <count-1; i++) {
            int addMoney = rdnm.nextInt(leftMoney /leftCount*2);
            list.add(addMoney);
            leftCount--;
            leftMoney -= addMoney;
        }
        list.add(leftMoney);
        return list;
    }


}
