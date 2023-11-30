package lesson_16_homework_task_02;

/*
Написать метод, принимающий две строки и возвращающий эти строки,
соединенные вместе, но без первых букв и в верхнем регистре.
Пример: "Hello", "There" -> ELLOHERE
 */


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a first string : ");
        String firstStr = myScanner.nextLine();
        System.out.print("Enter a second string : ");
        String secondStr = myScanner.nextLine();

        System.out.println(twoString(firstStr,secondStr));

    }

    private static String twoString(String first, String second) {

        return (first.toUpperCase().substring(1).concat(second.toUpperCase().substring(1)));
    }
}
