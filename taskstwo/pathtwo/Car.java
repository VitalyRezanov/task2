package com.netcracker.taskstwo.pathtwo;

public class Car {
    private int x;
    private int dX;
    private int fuel;

    public Car(int fuel) {
        this.fuel = fuel;
    }

    public int getDX() {
        return dX;
    }

    public int getFuel() {
        return fuel;
    }

    public void addFuel(int fuel) {
        this.fuel += fuel;
    }

    public void moveCar(int x) {
        this.dX += x;
        addFuel(-x);
    }
}
