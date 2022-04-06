package com.netcracker.taskstwo.partone;

import java.util.ArrayList;
import java.util.Scanner;

public class MagicBox {

    private static ArrayList<Integer> getIntArrayList (String[] arr) {
        ArrayList<Integer> arrayInt = new ArrayList<Integer>();
        for (int i = 0; i<arr.length; ++i) {
            arrayInt.add(Integer.parseInt(arr[i]));
        }
        return arrayInt;
    }

    private static boolean isMagicBox (ArrayList<ArrayList<Integer>> arrayList) {
        int sumD1 = 0;
        int sumD2 = 0;
        for (int i = 0; i < arrayList.get(0).size(); ++i) {
            sumD1 += arrayList.get(i).get(i);
            sumD2 += arrayList.get(i).get(arrayList.size() - i - 1);
        }
        int sumRow = 0;
        int sumColumn = 0;
        for (int i = 0; i < arrayList.size(); ++i) {
            sumRow = 0;
            sumColumn = 0;
            for (int j = 0; j < arrayList.get(i).size(); ++j) {
                sumRow += arrayList.get(i).get(j);
                sumColumn += arrayList.get(j).get(i);
            }
            if (sumRow != sumColumn) {
                break;
            }
        }
        return sumRow == sumColumn && sumColumn == sumD1 && sumD1 == sumD2;
    }

    public static void magicBox () {
        ArrayList<ArrayList<Integer>> array = new ArrayList<ArrayList<Integer>>();
        Scanner numbers = new Scanner(System.in);
        String str =  numbers.nextLine();
        ArrayList<Integer> input;

        while (!(str.equals(""))) {
            input = getIntArrayList(str.split(" "));
            array.add(input);
            str =  numbers.nextLine();
        }
        System.out.println(isMagicBox(array));
    }
}
