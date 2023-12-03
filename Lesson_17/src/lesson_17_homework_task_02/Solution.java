package lesson_17_homework_task_02;


/*
Написать метод, принимающий строку и целое число(индекс) и возвращающий строку
без символа, находящегося по этому индексу.

Пример:
int index = 3
String str = "Hello"

public static String removeCharAtIndex( String str, int index) -> "Helo"

 */

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scan.nextLine();


        System.out.print("Enter a number between a 0 and " + (str.length() - 1) + " : ");
        int indexForRemove = scan.nextInt();
        scan.close();

        System.out.println("New string without letter of number " +
                indexForRemove + " is: " + removeLetter(str, indexForRemove));
    }

    private static String removeLetter(String str, int indexForRemove) {

        if(indexForRemove < 0 || indexForRemove >= str.length()) {
            System.out.println("NUMBER MUST BE BETWEEN 0 AND " + (str.length() - 1) + "!!!");
            System.out.println(str.charAt(indexForRemove));
        } else {
            str = str.substring(0, indexForRemove) + str.substring(indexForRemove + 1);
            return str;
        }
        return null;
    }
}
