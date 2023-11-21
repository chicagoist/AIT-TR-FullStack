package lesson_11_homework_task_02;

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
        int index = 1;
        String line = "";

        while(index <= number) {
            line = line + index;
            System.out.println(line);
            index++;
        }
    }
}
