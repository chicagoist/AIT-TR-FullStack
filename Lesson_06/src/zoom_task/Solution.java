package zoom_task;

import java.util.Scanner;

/*
Написать программу, определяющую является ли введенное с клавиатуры целое число
        положительным, отрицательным или нулем. Программа выводит результат на экран
        Number is positive
        Number is negative
        Number is zero
*/

public class Solution {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    if (number > 0) {
      System.out.println("Number is positive");
    } else if (number < 0) {
      System.out.println("Number is negative");
    } else {
      System.out.println("Number is zero");
    }
  }
}
