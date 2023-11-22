package lesson_12_homework_task_02;


/*
Переписать задачу про треугольник из предыдущего дз используя циклы for
 */

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        printTriangle(number);
    }

    private static void printTriangle(int number) {

        for(int firstIndex = 1; firstIndex <= number; firstIndex++) {

            for(int secondIndex = 1; secondIndex <= firstIndex; secondIndex++) {
                System.out.print(secondIndex);

            }
            System.out.println("");
        }
    }
}
