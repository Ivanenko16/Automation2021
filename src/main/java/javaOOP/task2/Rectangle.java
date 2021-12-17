package javaOOP.task2;

public class Rectangle extends Rectangular {
    private final int a;
    private final int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void getSquare() {
        int c = a * b;
        System.out.println("Square = " + c);
    }

}
