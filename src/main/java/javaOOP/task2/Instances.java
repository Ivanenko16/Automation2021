package javaOOP.task2;

public class Instances {

    public static void main(String[] args) {

        Shape shape = new Circle(4);
        shape.getSquare();
        Circle circle = new Circle(2);
        System.out.println("Radius = " + circle.getRadius());

        shape = new Oval(3, 6);
        shape.getSquare();
        shape = new Rectangle(2, 5);
        shape.getSquare();
        shape = new Square(3);
        shape.getSquare();


    }
}
