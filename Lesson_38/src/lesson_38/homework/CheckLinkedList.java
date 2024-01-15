package lesson_38.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CheckLinkedList {

  public <T> List compareTwoLists(LinkedList<T> linkedList1, List<T> linkedList2) {
    List<String> result = new ArrayList<>();

    if (linkedList1.size() == linkedList2.size()) {
      for (int i = 0; i < linkedList1.size(); i++) {
        T elementLinked = linkedList1.get(i);
        if (elementLinked.equals(linkedList2.get(i))) {
          result.add("YES");
        } else {
          result.add("NO");
        }
      }
    }
    return result;
  }
}
