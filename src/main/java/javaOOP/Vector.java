package javaOOP;

import java.util.Random;

public class Vector {
    double x, y, z;

    public Vector() {
    }

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void lengthVector() {
        double length = Math.sqrt(scalarMultiplication());
        System.out.println(length);
    }

    private double scalarMultiplication() {
        double a = getX() * getX();
        double b = getY() * getY();
        double c = getZ() * getZ();
        return a + b + c;
    }

    public void createRandomVector() {
        Random random = new Random();
    }
}
