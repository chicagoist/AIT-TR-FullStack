package lesson_14_homework_task_02;

public class Main {
  public static void main(String[] args) {

    int[] numbersArray0 = {1, 2, 3, 4, 5};
    int[] numbersArray1 = {1, 2, 3, 5, 7};
    int[] numbersArray2 = {2};
    int[] numbersArray3 = {};

    System.out.println(
        "The number of even numbers in numbersArray0 is = " + Solution.evenNumbers(numbersArray0));
    System.out.println(
        "The number of even numbers in numbersArray1 is = " + Solution.evenNumbers(numbersArray1));
    System.out.println(
        "The number of even numbers in numbersArray2 is = " + Solution.evenNumbers(numbersArray2));
    System.out.println(
        "The number of even numbers in numbersArray3 is = " + Solution.evenNumbers(numbersArray3));
  }
}
