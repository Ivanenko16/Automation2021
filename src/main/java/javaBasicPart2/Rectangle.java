package javaBasicPart2;

public class Rectangle {

    private int height;
    private int weight;

    public Rectangle(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    public int area() {
        return weight * height;
    }
}
