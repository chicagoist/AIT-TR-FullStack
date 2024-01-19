package lesson_41.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
class MapProcessorTest {

    MapProcessor<String> mapProcessor;
    @BeforeEach
    public void setUp() {
        mapProcessor = new MapProcessor<String>();
    }
    @Test
    @DisplayName("Test 2")
    void countOccurrences2_test() {
        List<String> setOfNames = Arrays.asList("Paris", "London", "Berlin", "Madrid", "Berlin");
        assertEquals(2, mapProcessor.countOccurrences(setOfNames, "Berlin"));
      }

    @Test
    @DisplayName("Test 3")
    void countOccurrences3_test() {
        List<String> setOfNames = Arrays.asList("Paris", "London", "Berlin",
                "Madrid", "Berlin", "Berlin");
        assertEquals(3, mapProcessor.countOccurrences(setOfNames, "Berlin"));
    }
    @Test
    @DisplayName("Test 1")
    void countOccurrences1_test() {
        List<String> setOfNames = Arrays.asList("Paris", "Berlin");
        assertEquals(1, mapProcessor.countOccurrences(setOfNames, "Berlin"));
    }

    @Test
    @DisplayName("Test 0")
    void countOccurrences0_test() {
        List<String> setOfNames = Arrays.asList("Paris", "London", "Madrid");
        assertEquals(0, mapProcessor.countOccurrences(setOfNames, "Berlin"));
    }
}