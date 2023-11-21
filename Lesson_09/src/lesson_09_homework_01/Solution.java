package lesson_09_homework_01;

import java.util.Scanner;

/*
Написать метод, определяющий является ли целое число положительным,
отрицательным или нулем. Метод принимает целое число в качестве параметра и
возвращает соответствующую строку. В методе main вывести результат на экран
 */

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();

        System.out.println(zeroPositiveOrNegative(number));

    }

    public static String zeroPositiveOrNegative(int number) {
        if (number > 0) {
            return ("The number " + number + " is positive");
        } else if (number < 0) {
            return ("The number " + number + " is negative");
        } else {
            return ("The number " + number + " is zero");
        }

    }
}
