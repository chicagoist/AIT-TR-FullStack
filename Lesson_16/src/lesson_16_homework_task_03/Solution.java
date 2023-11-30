package lesson_16_homework_task_03;

/*
Написать метод, принимающий строку и возвращающий эту строку с переставленной в
конец строки первой буквой.
Примет: abcd -> bcda
 */


import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String testStr = myScanner.nextLine();

        String mixStr = mixingStrings(testStr);

        System.out.println(mixStr);
    }

    private static String mixingStrings(String str) {

        return str.concat(str.substring(0,1)).substring(1);

    }

}
