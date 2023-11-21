package homework_task01;

import java.util.Scanner;

/*
Написать метод, считающий площадь круга и возвращающий это значение в основную
программу. Формула для расчета площади area = pi* radius * radius
Значение радиуса должно передаваться как аргумент метода.
Затем, в методе main вывести полученное значение на экран
 */

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();
        System.out.println(circleArea(radius));

    }

    static double circleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
