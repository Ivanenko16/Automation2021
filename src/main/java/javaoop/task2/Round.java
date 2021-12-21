package javaoop.task2;

public abstract class Round implements Shape {

    private int rSmall;
    private int rBig;

    public Round(int rSmall, int rBig) {
        this.rSmall = rSmall;
        this.rBig = rBig;
    }

    public Round() {
    }

    @Override
    public void getSquare() {
        double c = Math.PI * rSmall * rBig;
        System.out.println("Square = " + c);
    }
}
