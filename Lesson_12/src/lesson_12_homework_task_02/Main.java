package lesson_12_homework_task_02;

import static lesson_12_homework_task_02.Solution.printTriangle;

import java.util.Scanner;

/*
Переписать задачу про треугольник из предыдущего дз используя циклы for
 */
public class Main {
  public static void main(String[] args) {
    System.out.print("Enter a number: ");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    scanner.close();

    printTriangle(number);
  }
}
