package lesson_10_homework_task_02;

import java.util.Scanner;

public class Solution {

  protected static void guessNumber(int secretNumber) {
    int attempts = 0;
    Scanner scanner = new Scanner(System.in);
    while (attempts < 7) {
      System.out.print("Enter number: ");
      int number = scanner.nextInt();
      attempts++;

      if (number < secretNumber) {
        System.out.println("Too low!");
      } else if (number > secretNumber) {
        System.out.println("Too high!");
      }
      System.out.println("Attempts: " + attempts);

      if (number == secretNumber) {
        System.out.println("YOU WIN! The secret number was: " + secretNumber + "");
        return;
      } else if (attempts == 7) {
        System.out.println("You lose! The secret number was: " + secretNumber + "");
        return;
      }
    }
  }
}
