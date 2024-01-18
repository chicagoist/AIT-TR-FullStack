package lesson_41.homework;

import java.util.List;

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
    int index = 0;
    for (T item : list) {
      if (item.equals(_name)) {
        index++;
      }
    }
    return index;
  }

}
