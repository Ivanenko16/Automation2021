package javaoop.task2;

public abstract class Rectangular implements Shape {

    private int a;
    private int b;

    public Rectangular(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Rectangular() {
    }

    @Override
    public void getSquare() {
        int c = a * b;
        System.out.println("Square = " + c);
    }
}