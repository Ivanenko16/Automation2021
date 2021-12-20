package javaoop;

import javaoop.task1.Vector;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Task1Tests {

    Vector vector1 = new Vector(1, 2, 2);
    Vector vector2 = new Vector(2, 1, 2);

    @Test
    public void checkLengthVector() {
        Assertions.assertEquals(3, vector1.lengthVector());
    }

    @Test
    public void checkScalarMultiplication() {
        Assertions.assertEquals(8, Vector.scalarMultiplication(vector1, vector2));
    }
}
