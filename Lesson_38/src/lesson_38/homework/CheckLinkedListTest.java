package lesson_38.homework;

import org.junit.jupiter.api.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CheckLinkedListTest {

  @Test
  @DisplayName("Проверка целочисленных списков")
    void testCompareTwoListsInt() {
      CheckLinkedList checker = new CheckLinkedList();

      LinkedList<Integer> linkedList1Int = new LinkedList<>();
      List<Integer> linkedList2Int = new ArrayList<>();
      linkedList1Int.add(1);
      linkedList1Int.add(2);
      linkedList1Int.add(3);
      linkedList1Int.add(4);

      linkedList2Int.add(5);
      linkedList2Int.add(2);
      linkedList2Int.add(3);
      linkedList2Int.add(8);

      List resultInt = checker.compareTwoLists(linkedList1Int, linkedList2Int);
      assertEquals(List.of("NO", "YES", "YES", "NO"), resultInt);
    }

    @Test
    @DisplayName("Проверка списков строк")
    void testCompareTwoListsString() {
      CheckLinkedList checker = new CheckLinkedList();

      LinkedList<String> linkedList1String = new LinkedList<>();
      List<String> linkedList2String = new ArrayList<>();
      linkedList1String.add("Paris");
      linkedList1String.add("London");
      linkedList1String.add("Madrid");
      linkedList1String.add("Napoli");

      linkedList2String.add("Paris");
      linkedList2String.add("Denwer");
      linkedList2String.add("Boston");
      linkedList2String.add("Napoli");

      List<String> resultString = checker.compareTwoLists(linkedList1String, linkedList2String);
      assertEquals(List.of("YES", "NO", "NO", "YES"), resultString);
    }
}
