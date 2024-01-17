package lesson_49.classwork;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StringListFinderTest {

    @Test
    @DisplayName("Проверьте findFirstString с непустым списком.")
    public void testFindFirstStringNonEmpty() {
        // Arrange
        List<String> stringList = Arrays.asList("apple", "banana", "cherry", "date");
        String expectedString = "banana";

        // Act
        String resultString = StringListFinder.findFirstString(stringList);

        // Assert
        Assertions.assertEquals(expectedString, resultString);
    }

    @Test
    @DisplayName("Проверьте findFirstString с пустым списком")
    public void testFindFirstStringEmpty() {
        // Arrange
        List<String> stringList = Collections.emptyList();

        // Act and Assert
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            StringListFinder.findFirstString(stringList);
        });
    }
}