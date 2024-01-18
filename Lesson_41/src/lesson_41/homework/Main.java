package lesson_41.homework;

/*
Задача на мапы: Дан список имен, в котором некоторые имена повторяются.
Написать метод, который по имени вернет количество вхождений этого имени в
список. т.е. метод принимает лист и имя и возвращает число, соответствующее
количеству раз , которое это имя встречается в листе.
 */

import java.util.*;

public class Main {
  public static void main(String[] args) {
    List<String> setOfNames = Arrays.asList("Paris", "London", "Berlin", "Madrid", "Berlin");
    //System.out.println(setOfNames); // debug
    MapProcessor<String> mapProcessor = new MapProcessor<String>();
    System.out.println(mapProcessor.countOccurrences(setOfNames, "Berlin"));
  }
}
