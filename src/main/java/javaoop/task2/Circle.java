package javaoop.task2;

public class Circle extends Round {

    private final int radius;

    public Circle(int r) {
        this.radius = r;
    }

    @Override
    public void getSquare() {
        double c = Math.PI * radius * radius;
        System.out.println("Square = " + c);
    }

    public double getRadius() {
        return radius;
    }
}
