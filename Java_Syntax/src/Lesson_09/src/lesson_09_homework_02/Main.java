package lesson_09_homework_02;

import static lesson_09_homework_02.Solution.decide;

import java.util.Scanner;

/*

Написать метод, который принимает в качестве параметра символ и проверяет
является ли он гласной или согласной буквой латинского алфавита.
В зависимости от введенного символа ch метод возвращает следующую строку:
ch is a vowel ( это гласная)
ch is a consonant ( это согласная)
the symbol is not a letter ( символ не является буквой)

Буквы могут быть как заглавными, так и прописными.
При использовании сканера, для получения отдельного символа используйте
конструкцию scanner.next().charAt(0)
В решении используйте switch и оператор if-else
В методе main выведите полученный результат на печать
 */

public class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter character: ");
    char character = scanner.next().charAt(0);
    System.out.println(decide(character));
    scanner.close();
  }
}
