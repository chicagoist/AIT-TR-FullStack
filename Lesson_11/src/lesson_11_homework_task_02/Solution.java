package lesson_11_homework_task_02;

public class Solution {

  /*    private static void printTriangle(int number) {
      int index = 1;
      String line = "";

      while(index <= number) {
          line = line + index;
          System.out.println(line);
          index++;
      }
  }*/

  protected static void printTriangle(int number) {

    int firstIndex = 1;

    while (firstIndex <= number) {

      int secondIndex = 1;

      while (secondIndex <= firstIndex) {
        System.out.print(secondIndex);
        secondIndex++;
      }
      System.out.println("");
      firstIndex++;
    }
  }
}
