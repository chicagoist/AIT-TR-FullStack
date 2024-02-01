package lesson_17_homework_task_03;

// tabnine::config
/*
Задача 3*

Написать свой собственный метод substring, работающий аналогично методу в Джаве.
Метод принимает строку , индексы начала и конца и возвращает подстроку.
String mySubstring( String string, int begin, int end).
 */

public class Solution {
  public static void main(String[] args) {

    String str = "Hello";
    System.out.println("The final string is: " + substring(str, 1, 5));
    System.out.println("The Substring is: " + str.substring(1, 5));
  }

  private static String substring(String str, int begin, int end) {

    char[] content = str.toCharArray();
    String newStr = "";

    if (begin < 0 || end > str.length()) {
      System.out.println(str.charAt(-1));
    } else {

      for (int i = begin; i < end; i++) {
        newStr = newStr.concat(String.valueOf(content[i]));
      }
      return newStr;
    }
    return null;
  }
}
