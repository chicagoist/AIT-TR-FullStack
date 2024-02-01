package lesson_08_homework_task01;

import static lesson_08_homework_task01.Solution.circleArea;

import java.util.Scanner;

/*
Написать метод, считающий площадь круга и возвращающий это значение в основную
программу. Формула для расчета площади area = pi* radius * radius
Значение радиуса должно передаваться как аргумент метода.
Затем, в методе main вывести полученное значение на экран
 */

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter radius: ");
    double radius = scanner.nextDouble();
    scanner.close();
    System.out.println(circleArea(radius));
  }
}
