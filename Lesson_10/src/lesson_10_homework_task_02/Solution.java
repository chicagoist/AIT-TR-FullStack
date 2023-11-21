package lesson_10_homework_task_02;


/*       С помощью цикла while таким образом, что игрок получает три
        количество попыток для отгадывания числа. Игра должна заканчиваться в
        двух случаях - либо отгадано секретное число либо закончилось
        количество попыток
*/

import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        int secretNumber = (int) (Math.random() * 10);
        //System.out.println("Secret Number is: " + secretNumber); // подсказка
        System.out.println("YOU HAVE ONLY 7 ATTEMPTS!");

        guessNumber(secretNumber);

    }

    private static void guessNumber(int secretNumber) {
        int attempts = 0;
        Scanner scanner = new Scanner(System.in);
        while(attempts < 7) {
            System.out.print("Enter number: ");
            int number = scanner.nextInt();
            attempts++;

            if(number < secretNumber) {
                System.out.println("Too low!");
            } else if(number > secretNumber) {
                System.out.println("Too high!");
            }
            System.out.println("Attempts: " + attempts);

            if(number == secretNumber) {
                System.out.println("YOU WIN! The secret number was: " + secretNumber + "");
                return;
            } else if(attempts == 7) {
                System.out.println("You lose! The secret number was: " + secretNumber + "");
                return;
            }
        }
    }

}

