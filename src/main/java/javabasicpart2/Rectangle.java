package javabasicpart2;

public class Rectangle {

    private int height;
    private int weight;

    public Rectangle(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int getArea() {
        return weight * height;
    }
}
