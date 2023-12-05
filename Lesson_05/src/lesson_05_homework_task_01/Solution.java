package lesson_05_homework_task_01;

/*
Пусть есть две переменные целого типа a и b. Написать программу,
печатающую true если значение хотя бы одной из этих переменных равно 10
 */

import java.util.Scanner;

public class Solution {
  public static void main(String[] args) {
    Scanner meinScanner = new Scanner(System.in);
    int a;
    int b;

    System.out.print("Geben Sie die erste Zahl ein : ");
    a = meinScanner.nextInt();

    System.out.print("Geben Sie die zweite Zahl ein : ");
    b = meinScanner.nextInt();

    // First variant
    if (a == 10 || b == 10) {
      System.out.println(true);
    } else {
      // System.out.println(false);
    }

    // Second variant
    // java тернарный оператор без else

    System.out.println(a == 10 || b == 10 ? true : "");
  }
}
