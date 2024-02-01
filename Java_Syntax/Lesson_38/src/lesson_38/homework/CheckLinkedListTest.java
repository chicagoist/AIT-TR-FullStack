package lesson_38.homework;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CheckLinkedListTest {

 @Test
 @DisplayName("Проверка сравненияTwoLists с целочисленными списками")
 void testCompareTwoListsInt() {
   // Arrange
   CheckLinkedList checkLinkedList = new CheckLinkedList();

   LinkedList<Integer> linkedList1Int = new LinkedList<>(Arrays.asList(1, 2, 3, 4));
   List<Integer> linkedList2Int = Arrays.asList(5, 2, 3, 8);
   List<String> expectedResultInt = Arrays.asList("NO", "YES", "YES", "NO");

   // Act
   List<String> resultInt = checkLinkedList.compareTwoLists(linkedList1Int, linkedList2Int);

   // Assert
   Assertions.assertEquals(expectedResultInt, resultInt);
 }

  @Test
  @DisplayName("Тестирование сравненияTwoLists со списками строк")
  void testCompareTwoListsString() {
    // Arrange
    CheckLinkedList checkLinkedList = new CheckLinkedList();

    LinkedList<String> linkedList1String = new LinkedList<>(Arrays.asList("Paris", "London", "Madrid", "Napoli"));
    List<String> linkedList2String = Arrays.asList("Paris", "Denwer", "Boston", "Napoli");
    List<String> expectedResultString = Arrays.asList("YES", "NO", "NO", "YES");

    // Act
    List<String> resultString = checkLinkedList.compareTwoLists(linkedList1String, linkedList2String);

    // Assert
    Assertions.assertEquals(expectedResultString, resultString);
  }

  @Test
  @DisplayName("Протестируйте сравнениеTwoLists с пустыми списками")
  void testCompareTwoListsEmpty() {
    // Arrange
    CheckLinkedList checkLinkedList = new CheckLinkedList();

    LinkedList<Integer> linkedListEmpty1 = new LinkedList<>();
    LinkedList<Integer> linkedListEmpty2 = new LinkedList<>();
    List<String> expectedResultEmpty = new LinkedList<>();

    // Act
    List resultEmpty = checkLinkedList.compareTwoLists(linkedListEmpty1, linkedListEmpty2);

    // Assert
    Assertions.assertEquals(expectedResultEmpty, resultEmpty);
  }


}
