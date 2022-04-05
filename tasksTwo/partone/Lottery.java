package com.netcracker.taskstwo.partone;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Lottery {
    public static void lottery () {
        ArrayList<Integer> arrayLottery = new ArrayList<Integer>();
        int min = 1;
        int max = 49;
        Random index = new Random();
        for (int i = 0; i < 6; ++i) {
            arrayLottery.add(i, index.nextInt((max - min) + 1) + min);
        }
        Collections.sort(arrayLottery);
        System.out.println(arrayLottery);
    }
}
