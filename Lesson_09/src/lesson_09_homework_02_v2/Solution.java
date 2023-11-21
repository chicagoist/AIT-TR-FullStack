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
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter character: ");
        char ch = scanner.next().charAt(0);
        System.out.println(checkLetter(ch));
        scanner.close();
    }

    public static String checkLetter(char ch) {
        if (Character.isLetter(ch)) {
            switch (Character.toLowerCase(ch)) {
                case 'a':
                case 'ä':
                case 'e':
                case 'i':
                case 'o':
                case 'ö':
                case 'u':
                case 'ü':
                    return ch + " is a vowel.";
                default:
                    return ch + " is a consonant.";
            }
        } else {
            return "The symbol is not a letter.";
        }
    }
}
