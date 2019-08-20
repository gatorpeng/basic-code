package cn.itcast.demo05_landlord;

import java.util.*;

public class Demo01_Test {
    public static void main(String[] args) {

        // Prepare the pokers
        Map<Integer, String> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        List<String> colors = List.of("♥", "♠", "♦", "♣");
        List<String> numbers = List.of("2", "A", "K", "Q", "L", "10", "9", "8", "7", "6", "5", "4", "3");

        map.put(0, "King");
        map.put(1, "Queen");
        list.add(0);
        list.add(1);


        Integer key = 2;
        for (String number : numbers) {
            for (String color : colors) {
                String value = number + color;
                map.put(key, value);
                list.add(key);
                key++;
            }
        }

        Set<Integer> integers = map.keySet();
        //System.out.println(integers);

        // shuffle the pokers
        Collections.shuffle(list);

        // distribute the cards
        ArrayList<Integer> player01 = new ArrayList<>();
        ArrayList<Integer> player02 = new ArrayList<>();
        ArrayList<Integer> player03 = new ArrayList<>();
        ArrayList<Integer> leftOver = new ArrayList<>();

        for (int i = 0; i < 54; i++) {
            Integer index = list.get(i);
            if (i>=51) {
                leftOver.add(index);
            } else if (i%3==0) {
                player01.add(index);
            } else if (i%3==1) {
                player02.add(index);
            } else if (i%3==2) {
                player03.add(index);
            }
        }

        // sort the cards
        Collections.sort(player01,Collections.reverseOrder());
        Collections.sort(player02,Collections.reverseOrder());
        Collections.sort(player03,Collections.reverseOrder());
        Collections.sort(leftOver,Collections.reverseOrder());

        // look at the pokers
        showCard("Player01",player01,map);
        System.out.println("================");
        showCard("Player02",player02,map);
        System.out.println("================");
        showCard("Player03",player03,map);
        System.out.println("================");
        showCard("LeftOver",leftOver,map);

    }

    private static void showCard(String playerName, List<Integer> keyList, Map<Integer,String> map) {
        System.out.print(playerName + ": ");
        for (Integer key : keyList) {
            String str = map.get(key);
            System.out.print(str+" ");
        }
        System.out.println("");


    }
}
