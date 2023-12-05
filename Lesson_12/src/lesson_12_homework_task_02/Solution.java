package lesson_12_homework_task_02;

public class Solution {

  protected static void printTriangle(int number) {

    for (int firstIndex = 1; firstIndex <= number; firstIndex++) {
      for (int secondIndex = 1; secondIndex <= firstIndex; secondIndex++) {
        System.out.print(secondIndex);
      }
      System.out.println("");
    }
  }
}
