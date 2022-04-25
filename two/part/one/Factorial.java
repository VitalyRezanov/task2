package com.netcracker.tasks.two.part.one;

import java.math.BigInteger;

public class Factorial {
    public static BigInteger getFactorial(int x) {
        BigInteger factorialBig = new BigInteger("1");
        while (x > 0) {
            factorialBig = factorialBig.multiply(new BigInteger(String.valueOf(x)));
            x -=1;
        }
        return factorialBig;
    }
}
