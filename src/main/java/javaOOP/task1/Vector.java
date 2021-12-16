package javaOOP.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Vector {
    private int x, y, z;
    private static final int lengthCreatedList = 20;

    public Vector() {
    }

    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public double lengthVector() {
        return Math.sqrt(getX() * getX() + getY() * getY() + getZ() * getZ());
    }

    public static double scalarMultiplication() {
        Random random = new Random();
        int randomVector1 = random.nextInt(lengthCreatedList);
        Vector vector1 = ListRandomVector().get(randomVector1);
        showArgumentsRandomVectors(vector1, "vector1");
        int randomVector2 = random.nextInt(lengthCreatedList);
        Vector vector2 = ListRandomVector().get(randomVector2);
        showArgumentsRandomVectors(vector2, "vector2");
        return scalarMultiplication(vector1, vector2);
    }

    public static double scalarMultiplication(Vector vector1, Vector vector2) {
        double a = vector1.getX() * vector2.getX();
        double b = vector1.getY() * vector2.getY();
        double c = vector1.getZ() * vector2.getZ();
        return a + b + c;
    }

    private static List<Vector> ListRandomVector() {
        List<Vector> vectorList = new ArrayList<>();
        for (int i = 0; i < lengthCreatedList; i++) {
            vectorList.add(createRandomVector());
        }
        return vectorList;
    }

    private static Vector createRandomVector() {
        Random random = new Random();
        Vector vector = new Vector(random.nextInt(30), random.nextInt(30), random.nextInt(30));
        Vector vector1 = new Vector();
        Vector[] vectors = new Vector[]{vector, vector1};
        int n = (int) Math.floor(Math.random() * vectors.length);
        return vectors[n];
    }

    private static void showArgumentsRandomVectors(Vector vector, String vectorName) {
        String name = vectorName.toUpperCase();
        System.out.println(name + vector);
    }

    @Override
    public String toString() {
        return " x:" + x + " y:" + y + " z:" + z;
    }
}

