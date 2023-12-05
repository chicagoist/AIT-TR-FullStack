package lesson_11_homework_task_01;

public class Solution {

  protected static void multiplyNumber(int number) {
    int index = 0;

    while (index <= number) {

      System.out.println(number + " * " + index + " = " + (number * index));
      index++;
    }
  }
}
