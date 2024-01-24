package cons_24jan2024;

import java.util.function.Function;
import java.util.function.Predicate;


public class Practice {


    public static String transformer(String input,
                                     Predicate<String> predicate,
                                     Function<String, String> function) {
        // Разбиваем строку на слова
        String[] words = input.split(" ");

        // Применяем операции для каждого слова
        for(int i = 0; i < words.length; i++) {
            if(predicate.test(words[i])) {
                words[i] = function.apply(words[i]);
            }
        }

        // преобразованные слова обратно в строку
        return String.join(" ", words);
    }

}

/* ПСЕВДОКОД
Пункт 1.
Функциональный интерфейс для операции преобразования:
- Function<T, S>: функция, которая принимает значение типа T и возвращает
значение типа S.


Функциональный интерфейс для предиката:
- Predicate<T>: предикат,
        который принимает значение типа T и возвращает булево значение.


Пункт 2.
Метод transformer принимает входную строку, предикат и оператор преобразования.

Для каждого слова в строке:
    - Если предикат выполняется для длины слова равной 3,
        применить оператор преобразования,
        который изменяет все буквы на заглавные.
    - Если предикат выполняется для длины слова равной 4,
        применить оператор преобразования,
        который изменяет все буквы на строчные.
    - Если предикат выполняется для длины слова равной 5,
        применить оператор преобразования,
        который изменяет все буквы на звездочки.

Вернуть строку с преобразованными словами.


Пункт 3.
transformer("aaa BBBB dDD eeEEe lll",
            word -> word.length() == 3,
            word -> word.toUpperCase())
    -> "AAA BBBB DDD  eeEEe LLL"

transformer("aaa BBBB dDD eeEEe lll",
            word -> word.length() == 4,
            word -> word.toLowerCase())
    -> "aaa bbbb dDD eeEEe lll"

transformer("aaa BBBB dDD eeEEe lll",
            word -> word.length() == 5,
            word -> "*****")
    -> "aaa BBBB dDD ***** lll"

 */
