package lesson_10_homework_task_02;

import static lesson_10_homework_task_02.Solution.guessNumber;

/*       С помощью цикла while таким образом, что игрок получает три
        количество попыток для отгадывания числа. Игра должна заканчиваться в
        двух случаях - либо отгадано секретное число либо закончилось
        количество попыток
*/
public class Main {
  public static void main(String[] args) {
    int secretNumber = (int) (Math.random() * 10);
    // System.out.println("Secret Number is: " + secretNumber); // подсказка
    System.out.println("YOU HAVE ONLY 7 ATTEMPTS!");

    guessNumber(secretNumber);
  }
}
