package lesson_10_homework_task_01;

import static lesson_10_homework_task_01.Solution.printCube;

import java.util.Scanner;

/*
С помощью цикла while написать метод, выводящий на экран куб числа от 1 до
заданного числа n.
static void printCube( int n )

        Пример:для числа n=3

        1 в кубе 1

        2 в кубе 8

        3 в кубе 27

        import java.util.Scanner;
*/

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter number: ");
    int number = scanner.nextInt();
    scanner.close();

    printCube(number);
  }
}
