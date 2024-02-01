package lesson_06_homework_task_01;

import java.util.Scanner;

/*
Есть две переменные целого типа. Написать программу, выводящую на экран сумму
их значений, а в том в случае, если эти числа равны, должна выводиться
двойная сумма.
Пример: 1 + 2 -> 3
3 + 2 -> 5
2 + 2 -> 8
 */

public class Solution {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("First number: ");
    int firstNumber = scanner.nextInt();

    System.out.print("Second number: ");
    int secondNumber = scanner.nextInt();

    if (firstNumber == secondNumber) {
      int doubleSum = 2 * (firstNumber + secondNumber);
      System.out.println(doubleSum);
    } else {
      int sum = firstNumber + secondNumber;
      System.out.println(sum);
    }
  }
}
