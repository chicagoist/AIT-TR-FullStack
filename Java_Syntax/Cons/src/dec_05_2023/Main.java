package dec_05_2023;

import java.util.Scanner;

/*
c +5 -> h
    z +5 -> e
    Код Цезаря. Закодированное слово получается смещением каждой буквы слова на
    n  символов вперед.
    Нужно написать класс, содержащий метод для такого кодирования. Слово должно
    передаваться как параметр этого
    метода а смещение n - в конструкторе класса
 */

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter a word: ");
    String text = scanner.nextLine();
    System.out.print("Enter a displacement number: ");
    int displacement = scanner.nextInt();
    scanner.close();
    CesarCode cesarCode = new CesarCode(displacement);
    System.out.println("Encrypted text = " + cesarCode.encrypt(text));
  }
}
