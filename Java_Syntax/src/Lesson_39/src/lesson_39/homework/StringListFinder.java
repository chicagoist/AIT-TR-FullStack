package lesson_39.homework;

import java.util.Iterator;
import java.util.List;

public class StringListFinder {
    public static String findFirstString(List<String> stringList) {
        if (stringList.isEmpty()) {
            throw new IllegalArgumentException("Список строк не должен быть пустым");
        }

        Iterator<String> iterator = stringList.iterator();
        String shortestString = iterator.next();
        String longestString = shortestString;

        while (iterator.hasNext()) {
            String str = iterator.next();
            if (str.length() < shortestString.length()) {
                shortestString = str;
            } else if (str.length() > longestString.length()) {
                longestString = str;
            }
        }

        // Возвращаем самую раннюю появившуюся строку - самую короткую или самую длинную
        // по номеру индекса в листе.
        return stringList.indexOf(shortestString) < stringList.indexOf(longestString) ? shortestString : longestString;
    }

}
