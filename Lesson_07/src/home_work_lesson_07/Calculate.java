package home_work_lesson_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) throws IOException {

        //Scanner myScanner = new Scanner(System.in);
        BufferedReader myScanner =
                new BufferedReader(new InputStreamReader(System.in));

        int firstNumber;
        int secondNumber;
        String operand;

        System.out.print("Enter the first number : ");
        //firstNumber = myScanner.nextInt();
        firstNumber = Integer.parseInt(myScanner.readLine());

        System.out.print("Enter the second number : ");
        //secondNumber = myScanner.nextInt();
        secondNumber = Integer.parseInt(myScanner.readLine());

        System.out.print("Enter the operand : ");
        // operand = myScanner.next();
        operand = myScanner.readLine();

        switch (operand) {
            case "+":
                System.out.println(firstNumber + secondNumber);
                break;
            case "-":
                System.out.println(firstNumber - secondNumber);
                break;
            case "*":
                System.out.println(firstNumber * secondNumber);
                break;
            case "/":
                if (secondNumber == 0) {
                    System.out.println("Division by zero");
                } else {
                    System.out.println(firstNumber / secondNumber);
                }
                break;
            case "%": // ERROR но если проверка на ноль в /  то и в % тоже
                // нужна :)
                if (secondNumber == 0) {
                    System.out.println("Division by zero");
                } else {
                    System.out.println(firstNumber % secondNumber);
                }
                break;
            default:
                System.out.println("Wrong operand");
                break;
        }
    }
}
