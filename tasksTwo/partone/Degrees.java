package com.netcracker.taskstwo.partone;

public class Degrees {
    public static int getDegrees(int deg) {
        deg %= 360;
        return deg >= 0 ? deg : 360 + deg;
    }
    public static int getDegreesFMod(int deg) {
        return Math.floorMod(deg, 360);
    }
}
