package lesson_16_homework_task_02;

import static lesson_16_homework_task_02.Solution.twoString;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner myScanner = new Scanner(System.in);
    System.out.print("Enter a first string : ");
    String firstStr = myScanner.nextLine();
    System.out.print("Enter a second string : ");
    String secondStr = myScanner.nextLine();

    System.out.println(twoString(firstStr, secondStr));
  }
}
