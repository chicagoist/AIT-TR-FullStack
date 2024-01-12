package lesson_36.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;

class CircleTest {
    @Test
    @DisplayName("Тест площади для радиуса 10.5")
    public void testCalculateArea() {
        Shape circle = new Circle(10.5);
        Shape circle1 = new Circle(0.5);
        Shape circle2 = new Circle(105);
        Shape circle3 = new Circle(1000);
        //S = π · r2
        double expectedArea = Math.PI * Math.pow(10.5, 2);
        double expectedArea1 = Math.PI * Math.pow(0.5, 2);
        double expectedArea2 = Math.PI * Math.pow(105, 2);
        double expectedArea3 = Math.PI * Math.pow(1000, 2);
        double actualArea = circle.calculateArea();
        double actualArea1 = circle1.calculateArea();
        double actualArea2 = circle2.calculateArea();
        double actualArea3 = circle3.calculateArea();
        Assertions.assertEquals(expectedArea, actualArea);
        Assertions.assertEquals(expectedArea1, actualArea1);
        Assertions.assertEquals(expectedArea2, actualArea2);
        Assertions.assertEquals(expectedArea3, actualArea3);
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
