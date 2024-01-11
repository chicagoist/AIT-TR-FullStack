package lesson_36.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;

class CircleTest {
    @Test
    @DisplayName("Тест площади для радиуса 10.5")
    public void testCalculateArea() {
        Shape circle = new Circle(10.5);
        //S = π · r2
        double expectedArea = Math.PI * Math.pow(10.5, 2);
        double actualArea = circle.calculateArea();
        Assertions.assertEquals(expectedArea, actualArea);
    }

    @Test
    @DisplayName("Тест длины для радиуса 10.5")
    public void testCalculatePerimeter() {
        Circle circle = new Circle(10.5);
        //C = 2 · π · r
        double expectedPerimeter = 2 * Math.PI * 10.5;
        double actualPerimeter = circle.calculatePerimeter();
        Assertions.assertEquals(expectedPerimeter, actualPerimeter);
    }
}
