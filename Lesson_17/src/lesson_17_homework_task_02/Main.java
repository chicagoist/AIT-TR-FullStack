package lesson_17_homework_task_02;

import static lesson_17_homework_task_02.Solution.removeLetter;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = scan.nextLine();

    System.out.print("Enter a number between a 0 and " + (str.length() - 1) + " : ");
    int indexForRemove = scan.nextInt();
    scan.close();

    System.out.println(
        "New string without letter of number "
            + indexForRemove
            + " is: "
            + removeLetter(str, indexForRemove));
  }
}
