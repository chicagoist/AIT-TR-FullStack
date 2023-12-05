package lesson_12_homework_task_01;

/*
Написать метод, принимающий с клавиатуры положительное число и печатающий
затем таблицу умножения для этого числа ( т.е. печатающий произведение этого
числа на все числа от 1 до 10).
 */

import static lesson_12_homework_task_01.Solution.multiplyNamber;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.print("Enter a number: ");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    scanner.close();
    multiplyNamber(number);
  }
}
