package lesson_11_homework_task_02;

import java.util.Scanner;

/*
Написать метод, выводящий на печать треугольник, состоящий из цифр от 1 до
числа n такого вида:

1
12
123
1234
12345
123456
 */

public class Solution {
    public static void main(String[] args) {

        System.out.print("Enter a number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();

        printTriangle(number);

    }

/*    private static void printTriangle(int number) {
        int index = 1;
        String line = "";

        while(index <= number) {
            line = line + index;
            System.out.println(line);
            index++;
        }
    }*/

        private static void printTriangle(int number) {

        int firstIndex = 1;

        while(firstIndex <= number) {

            int secondIndex = 1;

            while(secondIndex <= firstIndex) {
                System.out.print(secondIndex);
                secondIndex++;
            }
            System.out.println("");
            firstIndex++;
        }
    }




}
