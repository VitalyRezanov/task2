package com.netcracker;

import com.netcracker.taskstwo.partone.*;

public class Main {
    public static void main(String[] args) {

        MagicBox.magicBox();

        System.out.println(Degrees.getDegrees(-2456));

        System.out.println(Factorial.getFactorial(1000));

        Lottery.lottery ();

        NonEmptyString.getNonEmptyString(" Hi   jon ");
		
		Measurable[] employees = {new Employee(20.5, "Jon"), new Employee(21.5, "Barak"),
                new Employee(22.5, "Donald")};
        System.out.println(Measurable.average(employees));
        System.out.println(Measurable.largest(employees));
        System.out.println(Arrays.toString(employees));

        IntSequence sequence =  IntSequence.of(1, 2, 3, 4, 5);
        IntSequence sequence2 =  IntSequence.constant(1);

        while (sequence.hasNext()) {
            System.out.println(sequence.next());
        }
        while (sequence2.hasNext()) {
            System.out.println(sequence2.next());
        }
		
    }
}

