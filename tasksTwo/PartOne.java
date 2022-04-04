package com.netcracker.tasksTwo;

import java.math.BigInteger;
import java.util.*;

public class PartOne {

    //ch1 exercise 2
    public static int getDegrees(int deg) {
        deg %= 360;
        return deg >= 0 ? deg : 360 + deg;
    }
    public static int getDegreesFMod(int deg) {
        return Math.floorMod(deg, 360);
    }

    //ch exercise 6

    public static BigInteger getFactorial(int x) {
        BigInteger factorialBig = new BigInteger("1");
        while (x > 0) {
            factorialBig = factorialBig.multiply(new BigInteger(String.valueOf(x)));
            x -=1;
        }
        return factorialBig;
    }

    //ch exercise 8

    public static void getNonEmptyString (String str) {
        int indexBegin = 0;
        int indexEnd = 0;
        for (int i = 0; i<str.length(); ++i) {
            if (str.charAt(i) != ' ' && i !=0) {
                if (str.charAt(i-1) == ' ') {
                    indexBegin = i;
                }
                indexEnd = i;
            }
            if (str.charAt(i) == ' ' && i !=0 && str.charAt(i-1) != ' ' ) {
                System.out.println(str.substring(indexBegin, indexEnd+1));
            }
        }
    }

    //ch exercise 13

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

    //ch exercise 14

    private static ArrayList<Integer> getIntArrayList (String[] arr) {
        ArrayList<Integer> arrayInt = new ArrayList<Integer>();
        for (int i = 0; i<arr.length; ++i) {
            arrayInt.add(Integer.parseInt(arr[i]));
        }
        return arrayInt;
    }

    private static boolean isMagicBox (ArrayList<ArrayList<Integer>> arrayList) {
        int sumMagic = 0;
        int sumRow = 0;
        int sumColumn = 0;
        int sumD1 = 0;
        int sumD2 = 0;
        for (int i = 0; i < arrayList.get(0).size(); ++i) {
            sumMagic += arrayList.get(0).get(i);
            sumD1 += arrayList.get(i).get(i);
            sumD2 += arrayList.get(i).get(arrayList.size() - i - 1);
        }
        for (int i = 1; i < arrayList.size(); ++i) {
            sumRow = 0;
            sumColumn = 0;
            for (int j = 0; j < arrayList.get(i).size(); ++j) {
                sumRow += arrayList.get(i).get(j);
                sumColumn += arrayList.get(j).get(i);
            }
            if (sumRow != sumMagic && sumColumn != sumMagic) {
                break;
            }
        }
        return sumRow == sumMagic && sumColumn == sumMagic && sumD1 == sumMagic && sumD2 == sumMagic;
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
