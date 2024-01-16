package lesson_38.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/*

Написать метод, принимающий два листа целых чисел одинаковой длины и
возвращающий лист, содержащий элементы Yes или No, где значения на i-м месте
зависит от того, равны ли элементы этих двух листов под номером i.
Например, {1,2,3,4} и {5,2,3,8} вернет {No, Yes, Yes, No}
Протестировать.

 */
public class Main {
  public static void main(String[] args) {
    LinkedList<Integer> linkedList1 = new LinkedList<>();
    LinkedList<Integer> linkedListEmpty1 = new LinkedList<>();
    LinkedList<Integer> linkedListEmpty2 = new LinkedList<>();
    List<Integer> linkedList2 = new ArrayList<>();

    LinkedList<String> linkedListString1 = new LinkedList<>();
    List<String> linkedListString2 = new ArrayList<>();

    List returnList;

    linkedList1.add(1);
    linkedList1.add(2);
    linkedList1.add(3);
    linkedList1.add(4);

    linkedList2.add(5); // NO
    linkedList2.add(2); // YES
    linkedList2.add(3); // YES
    linkedList2.add(8); // NO

    linkedListString1.add("Paris");
    linkedListString1.add("London");
    linkedListString1.add("Madrid");
    linkedListString1.add("Napoli");

    linkedListString2.add("Paris"); // YES
    linkedListString2.add("Denwer"); // NO
    linkedListString2.add("Boston"); // NO
    linkedListString2.add("Napoli"); // YES

    CheckLinkedList checker = new CheckLinkedList();

    returnList = checker.compareTwoLists(linkedList1, linkedList2);
    System.out.println(returnList.toString());

    returnList = checker.compareTwoLists(linkedListString1, linkedListString2);
    System.out.println(returnList.toString());

    returnList = checker.compareTwoLists(linkedListEmpty1, linkedListEmpty2);
    System.out.println(returnList.toString());
  }
}
/* OUTPUT

[NO, YES, YES, NO]
[YES, NO, NO, YES]

Process finished with exit code 0

 */
