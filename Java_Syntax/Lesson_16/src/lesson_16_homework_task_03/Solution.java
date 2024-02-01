package lesson_16_homework_task_03;

/*
Написать метод, принимающий строку и возвращающий эту строку с переставленной в
конец строки первой буквой.
Примет: abcd -> bcda
 */

public class Solution {

  static String mixingStrings(String str) {

    return str.concat(str.substring(0, 1)).substring(1);
  }
}
