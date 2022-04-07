package com.netcracker.taskstwo.partthree;

public interface Measurable {
    double getMeasure();
    static double average(Measurable[] objects) {
        double sum = 0;
        for (int i = 0; i < objects.length; ++i) {
            sum += objects[i].getMeasure();
        }
        return sum/objects.length;
    }
    static String largest(Measurable[] objects) {
        double largest = objects[0].getMeasure();
        int index = 0;
        for (int i = 1; i < objects.length; ++i) {
            if (largest < objects[i].getMeasure()) {
                largest = objects[i].getMeasure();
                index = i;
            }
        }
        return ((Employee)objects[index]).getName();
    }
}
