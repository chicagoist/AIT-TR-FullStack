package lesson_10_homework_task_01;

/*
С помощью цикла while написать метод, выводящий на экран куб числа от 1 до
заданного числа n.
static void printCube( int n )

        Пример:для числа n=3

        1 в кубе 1

        2 в кубе 8

        3 в кубе 27

        import java.util.Scanner;
*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = scanner.nextInt();
        scanner.close();

        printCube(number);
    }

    private static void printCube(int number) {
        int index = 0;

        //Первый вариант

/*        if(number != 0) {
            while(index < number) {

                index++;
                System.out.println(index + " в кубе " + (index * index * index));
            }
        } else {
            System.out.println("0 в кубе 0");
        }
*/

        //Второй вариант

        if(number == 0) {
            System.out.println("0 в кубе 0");
            return;
        }

        while(++index <= number) {
            System.out.println(index + " в кубе " + (index * index * index));
        }
    }
}
