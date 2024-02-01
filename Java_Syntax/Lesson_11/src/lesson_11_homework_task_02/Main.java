package lesson_11_homework_task_02;

import static lesson_11_homework_task_02.Solution.printTriangle;

import java.util.Scanner;

/*
Написать метод, выводящий на печать треугольник, состоящий из цифр от 1 до
числа n такого вида:

1
12
123
1234
12345
123456
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
