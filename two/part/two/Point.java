package com.netcracker.tasks.two.part.two;

public final class Point {

    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public Point translate(double x, double y) {
        return new Point(this.x + x,this.y + y );
    }

    public Point scale(double factor) {
        return new Point(this.x * factor,this.y * factor );
    }


}
