package task_01;

/*
Написать программу, которая принимает с клавиатуры имя , фамилию и возраст (Ваши или воображаемого персонажа)
и выводит в консоль эту информацию в следующем виде:

First name: John

Last name: Smith

Age: 25

 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) throws IOException {

        String vorName;
        String nachName;
        // int dasAlter;
        String dasAlterString;

        // Scanner meinScanner = new Scanner(System.in);
        BufferedReader meinScanner =
                new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Geben Sie den Vorname ein : ");
        //vorName = meinScanner.nextLine();
        vorName = meinScanner.readLine();

        System.out.print("Geben Sie den Nachname ein : ");
        // nachName = meinScanner.nextLine();
        nachName = meinScanner.readLine();

        System.out.print("Geben Sie das Alter ein : ");
        // dasAlter = meinScanner.nextInt();
        dasAlterString = meinScanner.readLine();

        meinScanner.close();

        // System.out.printf("First name: %s\nLast name: %s\nAge: %d", vorName, nachName, dasAlter);
        System.out.printf("First name: %s\nLast name: %s\nAge: %s", vorName, nachName, dasAlterString);

    }
}
