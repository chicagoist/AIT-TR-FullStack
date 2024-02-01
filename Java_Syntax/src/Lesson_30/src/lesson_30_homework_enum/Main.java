package lesson_30_homework_enum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a your day: ");
        String enterdDay = myScanner.nextLine();

        Day askDay = new Day(enterdDay);
        System.out.println(askDay.askForWeekend());
    }
}
