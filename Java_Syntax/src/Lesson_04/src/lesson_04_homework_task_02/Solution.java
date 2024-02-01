package lesson_04_homework_task_02;

import java.util.Scanner;

/*
Написать программу, выводящую на экран ASCII значение символа.
Пример: 'А' результат - 65

 */
public class Solution {

  public static void main(String[] args) {

    Scanner meinScanner = new Scanner(System.in);
    char character;
    int genderCode;

    System.out.print("Geben Sie das Symbol ein : ");
    character = meinScanner.next().charAt(0);
    genderCode = character;

    System.out.println(genderCode);
  }
}
