package lesson_16_homework_task_01;

import static lesson_16_homework_task_01.Solution.*;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);
    System.out.print("Enter a string : ");
    String newStr = myScanner.nextLine();

    System.out.println(getDoubleLength(newStr));
  }
}
