package lesson_13_homework_task_03;

import static lesson_13_homework_task_03.Solution.findMin;

public class Main {
  public static void main(String[] args) {

    int[] numbersArray = new int[10];

    for (int i = 0; i < numbersArray.length; i++) {
      numbersArray[i] = (int) (Math.random() * 10);
      System.out.println(numbersArray[i]);
    }

    System.out.println("Min of the random Array is = " + findMin(numbersArray));
  }
}
