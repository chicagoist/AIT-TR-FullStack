package lesson_36.classwork;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    // Calculator calculator = new Calculator();
    Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Простое умножение должно быть корректным")
    public void testMultiply() {
        int result = calculator.multiply(5, 3);
        assertEquals(15, result);
    }

    @Test
    @DisplayName("Простое умножение отрицательных чисел")
    public void testMultiplyNegativeNumbers() {
        int result = calculator.multiply(-4, -2);
        assertEquals(8, result);
    }

    @Test
    @DisplayName("Простое умножение нуля на число")
    public void testMultiplyZero() {
        int result = calculator.multiply(0, 10);
        assertEquals(0, result);
    }

    @Test
    @DisplayName("Простое умножение числа на нуль")
    public void testMultiplyOneNumberZero() {
        int result = calculator.multiply(7, 0);
        assertEquals(0, result);
    }

    @Test
    @DisplayName("Простое умножение двух длинных чисел")
    public void testMultiplyLargeNumbers() {
        int result = calculator.multiply(10000, 10000);
        assertEquals(100000000L, result);
    }

    @Test
    @DisplayName("Больше ли первое число второго")
    public void testCompareNumbers() {
        //Calculator calculator = new Calculator();
        // Test case 1: a is greater than b
        int a = 5;
        int b = 3;
        assertTrue(calculator.compareNumbers(a, b), "Test case 1 failed");

        // Test case 2: a is equal to b
        a = 4;
        b = 4;
        assertFalse(calculator.compareNumbers(a, b), "Test case 2 failed");

        // Test case 3: a is less than b
        a = 2;
        b = 6;
        assertFalse(calculator.compareNumbers(a, b), "Test case 3 failed");

        System.out.println("All test cases passed");
    }
}