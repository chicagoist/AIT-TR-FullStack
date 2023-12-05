package home_work_lesson_07;

public class Calculate {
  protected static void calculate(int firstNumber, int secondNumber, String operand) {

    switch (operand) {
      case "+":
        System.out.println((double) firstNumber + secondNumber);
        break;
      case "-":
        System.out.println((double) firstNumber - secondNumber);
        break;
      case "*":
        System.out.println((double) firstNumber * secondNumber);
        break;
      case "/":
        if (secondNumber == 0) {
          System.out.println("Division by zero");
        } else {
          System.out.printf("%.2f", (double) firstNumber / secondNumber);
        }
        break;
      case "%": // ERROR но если проверка на ноль в /  то и в % тоже
        // нужна :)
        if (secondNumber == 0) {
          System.out.println("Division by zero");
        } else {
          System.out.println((double) firstNumber % secondNumber);
        }
        break;
      default:
        System.out.println("Wrong operand");
        break;
    }
  }
}
