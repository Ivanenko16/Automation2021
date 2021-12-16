package javaOOP.task1;

public class Run {

    public static void main(String[] args) {

        Vector vector = new Vector(1, 2, 2);
        Vector vector1 = new Vector(2, 2, 1);

        System.out.println("Length vector: " + vector.lengthVector());
        System.out.println("Scalar multiplication with parameters: " + Vector.scalarMultiplication(vector, vector1));
        System.out.println("Scalar multiplication without parameters(random): " + Vector.scalarMultiplication());


    }

}
