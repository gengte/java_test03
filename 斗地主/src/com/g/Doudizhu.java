package com.g;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Doudizhu {
    public static void main(String[] args) {
        List<String> color = List.of("♠", "♥", "♣", "♦");
        List<String> number = List.of("2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3");

        HashMap<Integer, String> pokers = new HashMap<>();
        ArrayList<Integer> pokersIndexs = new ArrayList<>();

        pokers.put(0, "大王");
        pokers.put(1, "小王");
        pokersIndexs.add(0);
        pokersIndexs.add(1);

        Integer i = 2;
        for (String n : number) {
            for (String c : color) {
                pokers.put(i, c + n);
                pokersIndexs.add(i);
                i++;
            }
        }
        Collections.shuffle(pokersIndexs);
        // System.out.println(pokersIndexs);
        ArrayList<Integer> player1 = new ArrayList<>();
        ArrayList<Integer> player2 = new ArrayList<>();
        ArrayList<Integer> player3 = new ArrayList<>();
        ArrayList<Integer> dipai = new ArrayList<>();
        for (int j = 0; j < pokersIndexs.size(); j++) {
            if (j < 3) {
                dipai.add(pokersIndexs.get(j));
            } else if (j % 3 == 0) {
                player1.add(pokersIndexs.get(j));
            } else if (j % 3 == 1) {
                player2.add(pokersIndexs.get(j));
            } else if (j % 3 == 2) {
                player3.add(pokersIndexs.get(j));
            }
        }

        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(dipai);

        LookPokers("Tom", player1, pokers);
        LookPokers("Tony", player2, pokers);
        LookPokers("Jerry", player3, pokers);
        LookPokers("dipai", dipai, pokers);
    }

    private static void LookPokers(String name, ArrayList<Integer> indexs, HashMap<Integer, String> pokers) {
        System.out.print(name+" ");
        for (Integer i : indexs) {
            System.out.print(pokers.get(i) + " ");
        }
        System.out.println();
    }
}
