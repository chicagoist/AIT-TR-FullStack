package cons_24jan2024;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

import java.util.function.Function;
import java.util.function.Predicate;

public class PracticeTest {

    @Test
    @DisplayName("Тестовый преобразователь с преобразованием верхнего регистраn")
    public void testTransformerUpperCase() {
        // Arrange
        String input = "aaa BBBB dDD eeEEe lll";
        Predicate<String> predicate = word -> word.length() == 3;
        Function<String, String> function = String::toUpperCase;
        String expectedOutput = "AAA BBBB DDD eeEEe LLL";

        // Act
        String result = Practice.transformer(input, predicate, function);

        // Assert
        Assertions.assertEquals(expectedOutput, result);
    }

    @Test
    @DisplayName("Тестовый трансформатор со строчной трансформацией")
    public void testTransformerLowerCase() {
        // Arrange
        String input = "aaa BBBB dDD eeEEe lll";
        Predicate<String> predicate = word -> word.length() == 4;
        Function<String, String> function = String::toLowerCase;
        String expectedOutput = "aaa bbbb dDD eeEEe lll";

        // Act
        String result = Practice.transformer(input, predicate, function);

        // Assert
        Assertions.assertEquals(expectedOutput, result);
    }

    @Test
    @DisplayName("Тестовый трансформатор с заменным преобразованием")
    public void testTransformerReplaceWithStars() {
        // Arrange
        String input = "aaa BBBB dDD eeEEe lll";
        Predicate<String> predicate = word -> word.length() == 5;
        Function<String, String> function = word -> "*****";
        String expectedOutput = "aaa BBBB dDD ***** lll";

        // Act
        String result = Practice.transformer(input, predicate, function);

        // Assert
        Assertions.assertEquals(expectedOutput, result);
    }
}