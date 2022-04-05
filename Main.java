package com.netcracker;

import com.netcracker.taskstwo.partone.*;

public class Main {
    public static void main(String[] args) {

        MagicBox.magicBox();

        System.out.println(Degrees.getDegrees(-2456));

        System.out.println(Factorial.getFactorial(1000));

        Lottery.lottery ();

        NonEmptyString.getNonEmptyString(" Hi   jon ");
		
    }
}

