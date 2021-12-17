package javaOOP.task2;

public class Square extends Rectangular {

    private final int a;

    public Square(int a) {
        this.a = a;
    }

    @Override
    public void getSquare() {
        int c = a * a;
        System.out.println("Square = " + c);
    }
}
