package task_02;

/*
Есть три переменные целого типа. Написать программу, которая сравнивает эти
числа и выводит на экран результат:

    All numbers are equal если они равны
    All numbers are different если все они все разные
    Some numbers are equal если какие-то из них равны

 */
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        System.out.print("Enter third number: ");
        int thirdNumber = scanner.nextInt();

        if (firstNumber == secondNumber && secondNumber == thirdNumber) {
            System.out.println("All numbers are equal");
        } else if (firstNumber != secondNumber && secondNumber != thirdNumber && thirdNumber != firstNumber) {
            System.out.println("All numbers are different");
        } else if (firstNumber == secondNumber || secondNumber == thirdNumber || thirdNumber == firstNumber) {
            System.out.println("Some numbers are equal ");
        }

    }
}
