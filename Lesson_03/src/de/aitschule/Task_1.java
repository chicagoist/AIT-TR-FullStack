package de.aitschule;

/*
Написать программу, выводящую на экран результат деления двух чисел 25 и 3.
Результат не должен быть округлен до целых.
Посчитать также остаток от деления этих чисел.
* */

public class Task_1 {

    public static void main(String[] args) {

        int firstNumber = 25;
        int secondNumber = 3;

        double divdideResult = (double) firstNumber / secondNumber;
        System.out.println("Divide result is = " + divdideResult); // результат равен 8.333333333333334

        int remainder = firstNumber % secondNumber;
        System.out.println("Remainder is = " + remainder); // остаток равен 1


    }

}
