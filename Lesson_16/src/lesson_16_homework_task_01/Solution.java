package lesson_16_homework_task_01;

/*
Написать метод, принимающий строку и возвращающий целое число, равное двойной длине строки
Пример: Hello -> 10
 */

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String newStr = myScanner.nextLine();

        System.out.println(getDoubleLength(newStr));




    }

    private static int getDoubleLength(String str) {

        return (str.length() * 2);

    }
}
