package javaBasicPart2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleTests {


    @Test
    public void checkRectangleArea() {
        Rectangle rectangle = new Rectangle(50,40);
        Assertions.assertEquals(2000, rectangle.area());
    }

}
