package lesson_03_homework_task_02;

/*
Написать программу, выводящую на экран значение переменной типа инт в квадрате.
Предварительно обьявите эту переменную и задайте ее значение
 */

public class Task_2 {

  public static void main(String[] args) {

    int powValue = 2;
    int value = 4;
    int resultOfPow = 0;

    // Variant first
    resultOfPow = value * value;
    System.out.println("Result of pow is = " + resultOfPow);

    // Variant second
    resultOfPow = (int) Math.pow(value, powValue);
    System.out.println("Result of Math.pow(4, 2) is = " + resultOfPow); // результат 16
  }
}
