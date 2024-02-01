package home_work_lesson_07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
  public static void main(String[] args) throws IOException {

    // Scanner myScanner = new Scanner(System.in);
    BufferedReader myScanner = new BufferedReader(new InputStreamReader(System.in));

    int firstNumber;
    int secondNumber;
    String operand;

    System.out.print("Enter the first number : ");
    // firstNumber = myScanner.nextInt();
    firstNumber = Integer.parseInt(myScanner.readLine());

    System.out.print("Enter the second number : ");
    // secondNumber = myScanner.nextInt();
    secondNumber = Integer.parseInt(myScanner.readLine());

    System.out.print("Enter the operand : ");
    // operand = myScanner.next();
    operand = myScanner.readLine();

    Calculate.calculate(firstNumber, secondNumber, operand);
  }
}
