package task_03;


import java.util.Scanner;

/*
Со звездочкой, не обязательная

Есть 2 целочисленные переменные a и b. Пусть a = 1, b =2.
С помощью оператора присваивания и математических действий сложения
и вычитания поменять значения a и b местами. т.е. должно быть в результате
a =2, b=1. Просто присвоить a и b эти значения или вводить третью переменную
нельзя. Задача должна быть решена для общего случая, т.е. для любых двух
значений переменных, 1 и 2 просто пример. Если не получится с двумя переменными,
можно попробовать более легкий вариант решения с введением третьей
дополнительной переменной.

 */
public class Solution {

    public static void main(String[] args) {

        Scanner meinScanner = new Scanner(System.in);
        int ersteNummer;
        int zweiteNummer;

        System.out.print("Geben Sie das erste Nummer ein. : ");
        ersteNummer = meinScanner.nextInt();

        System.out.print("Geben Sie das zweite Nummer ein. : ");
        zweiteNummer = meinScanner.nextInt();

        System.out.println("\nDie erste Nummer ist : " + ersteNummer);
        System.out.println("Die zweite Nummer ist : " + zweiteNummer + "\n");

        ersteNummer = ersteNummer + zweiteNummer;
        zweiteNummer = ersteNummer - zweiteNummer;
        ersteNummer = ersteNummer - zweiteNummer;

        System.out.println("Und jetzt das Gegenteil:\n");
        System.out.println("Die erste Nummer ist : " + ersteNummer);
        System.out.println("Die zweite Nummer ist : " + zweiteNummer);


    }
}
