package lesson_36.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.*;

class RectangleTest {

    @Test
    @DisplayName("Тест периметра по значениям 10.5, 11.3")
    void calculatePerimeter() {
        // P = 2 * ( a + b )
        Shape rectangleTest = new Rectangle(10.5, 11.3);
        double expectedPerimeter = 2 * (10.5 + 11.3);
        double actualPerimeter = rectangleTest.calculatePerimeter();
        Assertions.assertEquals(expectedPerimeter,actualPerimeter);
    }

    @Test
    @DisplayName("Тест площади по значениям 10.5, 11.3")
    void calculateArea() {
        Shape rectangleTest = new Rectangle(10.5, 11.3);
        // S = a * b
        double expectedArea = 10.5 * 11.3;
        double actualArea = rectangleTest.calculateArea();
        Assertions.assertEquals(expectedArea,actualArea);
      }
}