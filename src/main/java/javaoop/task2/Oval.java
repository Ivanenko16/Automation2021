package javaoop.task2;

public class Oval extends Round {

    private final int rSmall;
    private final int rBig;

    public Oval(int rSmall, int rBig) {
        this.rSmall = rSmall;
        this.rBig = rBig;
    }

    @Override
    public void getSquare() {
        double c = Math.PI * rSmall * rBig;
        System.out.println("Square = " + c);
    }
}
