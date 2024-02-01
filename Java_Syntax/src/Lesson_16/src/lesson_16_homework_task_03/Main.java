package lesson_16_homework_task_03;

import static lesson_16_homework_task_03.Solution.mixingStrings;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);
    System.out.print("Enter a string : ");
    String testStr = myScanner.nextLine();

    String mixStr = mixingStrings(testStr);

    System.out.println(mixStr);
  }
}
