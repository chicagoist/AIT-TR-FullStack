package lesson_23_homework_calc;

/*
Задача 1

Создать класс Calculator, способный выполнять два арифметических действия -
сложение двух чисел, вычитание двух чисел а также сложение трех чисел и
вычитание трех чисел.
Калькулятор должен работать как для целых чисел, так и для чисел с запятой.
(т.е. в классе надо создать соответствующие методы и затем вызывать их в
методе main)

 */

public class Main {
    public static void main(String[] args) {

       // Calculator calculator = new Calculator();
        Calculator.addingTwoNumbers(-2.0,3);
        Calculator.addingTwoNumbers(2.0,3);
        Calculator.addingTwoNumbers(2,3.0);
        Calculator.addingTwoNumbers(2,3);
        Calculator.addingTwoNumbers(2.0,3.0);
        System.out.println("");

        Calculator.subtractingTwoNumbers(-2.0,3);
        Calculator.subtractingTwoNumbers(2.0,3);
        Calculator.subtractingTwoNumbers(2,3.0);
        Calculator.subtractingTwoNumbers(2,3);
        Calculator.subtractingTwoNumbers(2.0,3.0);
        System.out.println("");

        Calculator.addingThreeNumbers(2,3,2);
        Calculator.addingThreeNumbers(2.0,3,2);
        Calculator.addingThreeNumbers(2.0,3.0,2);
        Calculator.addingThreeNumbers(2.0,3.0,2.0);
        Calculator.addingThreeNumbers(2,3.0,2.0);
        Calculator.addingThreeNumbers(2,3,2.0);
        Calculator.addingThreeNumbers(2.0,3,2.0);
        Calculator.addingThreeNumbers(2,3.0,2);
        System.out.println("");

        Calculator.subtractingThreeNumbers(4,5,6);
        Calculator.subtractingThreeNumbers(4.0,5,6);
        Calculator.subtractingThreeNumbers(4.0,5.0,6);
        Calculator.subtractingThreeNumbers(4.0,5.0,6.0);
        Calculator.subtractingThreeNumbers(4,5.0,6.0);
        Calculator.subtractingThreeNumbers(4,5,6.0);
        Calculator.subtractingThreeNumbers(4.0,5,6.0);
        Calculator.subtractingThreeNumbers(4,5.0,6);


    }
}
