package lesson_11_homework_task_01;

import static lesson_11_homework_task_01.Solution.multiplyNumber;

import java.util.Scanner;

/*
Написать метод, выводящий на печать результат умножения данного числа n на
все целые числа от 0 до n
 */
public class Main {
  public static void main(String[] args) {

    System.out.print("Enter number: ");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    scanner.close();

    multiplyNumber(number);
  }
}
