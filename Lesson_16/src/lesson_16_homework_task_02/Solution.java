package lesson_16_homework_task_02;

/*
Написать метод, принимающий две строки и возвращающий эти строки,
соединенные вместе, но без первых букв и в верхнем регистре.
Пример: "Hello", "There" -> ELLOHERE
 */

public class Solution {

  protected static String twoString(String first, String second) {

    return (first.toUpperCase().substring(1).concat(second.toUpperCase().substring(1)));
  }
}
