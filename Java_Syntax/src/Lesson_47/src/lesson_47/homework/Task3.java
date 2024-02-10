package lesson_47.homework;

import java.util.List;

public class Task3 {
    /*
    Написать метод, принимающий в качестве параметров две строки. Первая
    строка состоит из слов, разделенных пробелом. Метод возвращает количество
     слов первой строки, начинающихся со второй строки.
Пример : Первая строка "aaaaaaa cccc ab bbbbb a ff aaa"
Если вторая строка а, то ответ 4
Если вторая строка ааа, ответ 2
Если вторая строка aaaa, ответ 1
     */

    protected static int findNumberOfWordsOftheFirstString(String line, String value) {
        List<String> words = List.of(line.split("\\s+")); // Разделение строки на слова

        long count = words.stream()
                .filter(w -> w.startsWith(value))
                .count();
        return (int) count;
    }
}
