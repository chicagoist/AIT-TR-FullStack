package homework_task02;

import java.util.Scanner;


/*
Написать метод, конвертирующий температуру из градусов Фаренгейта в градусы
Цельсия по формуле С = 5*(F-32)/9. Значение градусов Фаренгейта должно
передаваться как аргумент метода.
Метод должен возвращать полученное значение в основную программу.
Затем, в методе main вывести полученное значение на экран.
 */

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter  Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        //System.out.println(celsius(fahrenheit));
        System.out.printf("%.2f", celsius(fahrenheit));
    }

    private static double celsius(double fahrenheit) {
        // С = 5*(F-32)/9
        return (5.0 * (fahrenheit - 32.0)) / 9;
    }
}
