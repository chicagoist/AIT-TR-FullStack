package lesson_09_homework_01;

import static lesson_09_homework_01.Solution.zeroPositiveOrNegative;

import java.util.Scanner;

/*
Написать метод, определяющий является ли целое число положительным,
отрицательным или нулем. Метод принимает целое число в качестве параметра и
возвращает соответствующую строку. В методе main вывести результат на экран
 */
public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter number: ");
    int number = scanner.nextInt();
    scanner.close();

    System.out.println(zeroPositiveOrNegative(number));
  }
}
