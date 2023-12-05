package lesson_08_homework_task02;

/*
Написать метод, конвертирующий температуру из градусов Фаренгейта в градусы
Цельсия по формуле С = 5*(F-32)/9. Значение градусов Фаренгейта должно
передаваться как аргумент метода.
Метод должен возвращать полученное значение в основную программу.
Затем, в методе main вывести полученное значение на экран.
 */

import static lesson_08_homework_task02.Solution.celsius;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter  Fahrenheit: ");
    double fahrenheit = scanner.nextDouble();
    // System.out.println(celsius(fahrenheit));
    System.out.printf("%.2f", celsius(fahrenheit));
  }
}
