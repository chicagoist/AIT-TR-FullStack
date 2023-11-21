package lesson_09_homework_02;

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

public class Solution {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter character: ");
        char character = scanner.next().charAt(0);
        System.out.println(decide(character));
        scanner.close();

    }

    public static String decide(char unknowCharacter) {
        if (Character.isLetter(unknowCharacter)) {
            switch (unknowCharacter) {
                case 'A':
                case 'a':
                case 'E':
                case 'e':
                case 'Y':
                case 'y':
                case 'U':
                case 'u':
                case 'I':
                case 'i':
                case 'O':
                case 'o':
                case 'Ö':
                case 'ö':
                case 'Ü':
                case 'ü':
                case 'Ä':
                case 'ä':
                    return ("The character " + unknowCharacter + " is a vowel");

                default:
                    return ("The character " + unknowCharacter + " is consonant");
            }
        } else {
            return ("The character " + unknowCharacter + " is not a letter");
        }
    }
}
