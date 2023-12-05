package lesson_17_homework_task_02;

/*
Написать метод, принимающий строку и целое число(индекс) и возвращающий строку
без символа, находящегося по этому индексу.

Пример:
int index = 3
String str = "Hello"

public static String removeCharAtIndex( String str, int index) -> "Helo"

 */

public class Solution {

  protected static String removeLetter(String str, int indexForRemove) {

    if (indexForRemove < 0 || indexForRemove >= str.length()) {
      System.out.println("NUMBER MUST BE BETWEEN 0 AND " + (str.length() - 1) + "!!!");
      System.out.println(str.charAt(indexForRemove));
    } else {
      str = str.substring(0, indexForRemove) + str.substring(indexForRemove + 1);
      return str;
    }
    return null;
  }
}
