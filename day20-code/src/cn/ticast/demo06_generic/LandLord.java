package cn.ticast.demo06_generic;

import java.util.ArrayList;
import java.util.Collections;

public class LandLord {
    public static void main(String[] args) {
        // generate pokers

        ArrayList<String> pokers = new ArrayList<>();
        pokers.add("King");
        pokers.add("Queen");

        String[] colors = {"♠", "♥", "♦", "♣"};
        String[] numbers = {"2", "A", "K", "Q", "L", "10", "9", "8", "7", "6", "5", "4", "3"};

        for (String number : numbers) {
            for (String color : colors) {
                pokers.add(number + color);
            }
        }

//        System.out.println(pokers);

        // shuffle the pokers
        Collections.shuffle(pokers);

        // distribute the pokers to players
        ArrayList<String> player01 = new ArrayList<>();
        ArrayList<String> player02 = new ArrayList<>();
        ArrayList<String> player03 = new ArrayList<>();
        ArrayList<String> leftOver = new ArrayList<>();

        for (int i = 0; i < pokers.size(); i++) {
            String card = pokers.get(i);
            if (i >= 51) {
                leftOver.add(card);
            } else if (i % 3 == 0) {
                player01.add(card);
            } else if (i % 3 == 1) {
                player02.add(card);
            } else if (i % 3 == 2) {
                player03.add(card);
            }
        }

        Collections.sort(player01);
        Collections.sort(player02);
        Collections.sort(player03);


        // look at the cards
        System.out.println("Scarlett: " + player01);
        System.out.println("Julia: " + player02);
        System.out.println("Jennifer: " + player03);
        System.out.println("LeftOver: " + leftOver);

    }
}
