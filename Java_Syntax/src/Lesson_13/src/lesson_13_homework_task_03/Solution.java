package lesson_13_homework_task_03;

public class Solution {

  protected static int findMin(int[] ints) {

    int min = ints[0];
    for (int i = 1; i < ints.length; i++) {
      if (min > ints[i]) {
        min = ints[i];
      }
    }
    return min;
  }
}
