package lesson_14_homework_task_01;

import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    int[] numbersArray0 = {1, 2, 3, 4, 5};
    int[] numbersArray1 = {1, 2, 3, 4, 6};
    int[] numbersArray2 = {1, 2, 3, 4, 5};

    System.out.println("###########################################");
    System.out.println("numbersArray0 have numbers: " + Arrays.toString(numbersArray0));
    System.out.println("numbersArray1 have numbers: " + Arrays.toString(numbersArray1));
    System.out.println("numbersArray2 have numbers: " + Arrays.toString(numbersArray2));
    System.out.println("###########################################");

    System.out.println(
        "Compare arrays numbersArray0 and numbersArray1 is"
            + " = "
            + Solution.compare(numbersArray0, numbersArray1));
    System.out.println(
        "Compare arrays numbersArray0 and numbersArray2 is"
            + " = "
            + Solution.compare(numbersArray0, numbersArray2));
    System.out.println(
        "Compare arrays numbersArray1 and numbersArray2 is"
            + " = "
            + Solution.compare(numbersArray1, numbersArray2));
  }
}
