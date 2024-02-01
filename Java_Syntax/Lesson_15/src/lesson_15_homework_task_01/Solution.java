package lesson_15_homework_task_01;

public class Solution {

  static boolean equalsToThirty(int[] array) {
    boolean result = false;
    int index = 0;

    for (int j : array) {

      if (j == 10) {

        index++;
      }
    }

    if (index * 10 == 30) {
      result = true;
    }

    return result;
  }
}
