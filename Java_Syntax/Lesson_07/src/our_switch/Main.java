package our_switch;

import static our_switch.PrintANumber.printANumber;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int number = sc.nextInt();
    sc.close();
    printANumber(number);
  }
}
