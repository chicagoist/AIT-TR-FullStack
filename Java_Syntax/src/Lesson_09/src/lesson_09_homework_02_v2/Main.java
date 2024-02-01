package lesson_09_homework_02_v2;

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
import static lesson_09_homework_02_v2.Solution.checkLetter;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter character: ");
    char ch = scanner.next().charAt(0);
    System.out.println(checkLetter(ch));
    scanner.close();
  }
}
