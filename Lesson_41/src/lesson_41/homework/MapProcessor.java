package lesson_41.homework;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
// ПСЕВДОКОД:
Метод подсчета_вхождений(список, искомое_имя):
    счетчик = 0

    для каждого элемента в списке:
        если элемент равен искомому_имени:
            увеличить счетчик на 1

    вернуть счетчик
*/

public class MapProcessor<T> {

  public int countOccurrences(List<T> list, T _name)  {
    Map<T, Integer> occurrencesMap = new HashMap<>();

    // Заполняем HashMap с количеством вхождений каждого элемента
    for (T item : list) {
      if (occurrencesMap.containsKey(item)) {
        occurrencesMap.put(item, occurrencesMap.get(item) + 1);
      } else {
        occurrencesMap.put(item, 1);
      }
    }

    // Возвращаем количество вхождений для заданного элемента
    return occurrencesMap.containsKey(_name) ? occurrencesMap.get(_name) : 0;
  }


/*    int index = 0;
    for (T item : list) {
      if (item.equals(_name)) {
        index++;
      }
    }
    return index;
  }*/

}
