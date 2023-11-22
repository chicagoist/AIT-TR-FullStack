package lesson_12_homework_task_01;


/*
Написать метод, принимающий с клавиатуры положительное число и печатающий
затем таблицу умножения для этого числа ( т.е. печатающий произведение этого
числа на все числа от 1 до 10).
 */

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        multiplyNamber(number);

    }

    private static void multiplyNamber(int number) {

        for(int i = 1; i <= 10; i++) {

            System.out.println(number + " * " + i + " = " + number * i);

        }
        System.out.println("");
    }
}
