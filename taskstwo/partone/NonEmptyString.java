package com.netcracker.taskstwo.partone;

public class NonEmptyString {
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
}
