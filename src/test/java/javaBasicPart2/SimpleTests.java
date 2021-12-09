package javaBasicPart2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleTests {


    @Test
    public void checkRectangleArea() {
        Rectangle rectangle = new Rectangle();
        rectangle.weight = 40;
        rectangle.height = 50;
        Assertions.assertEquals(2000, rectangle.area());
    }

}
