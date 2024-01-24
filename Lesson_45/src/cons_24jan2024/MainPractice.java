package cons_24jan2024;

import java.util.function.Function;
import java.util.function.Predicate;

public class MainPractice {

    public static void main(String[] args) {
        String str = "aaa BBBB dDD eeEEe lll";
        Predicate<String> predicate = (s) -> s.length() == 3;
        Function<String, String> function = String::toUpperCase;

        String result1 = Practice.transformer("aaa BBBB dDD eeEEe lll",
                word -> word.length() == 3,
                word -> word.toUpperCase());

        String result2 = Practice.transformer("aaa BBBB dDD eeEEe lll",
                word -> word.length() == 4,
                word -> word.toLowerCase());

        String result3 = Practice.transformer("aaa BBBB dDD eeEEe lll",
                word -> word.length() == 5,
                word -> "*****");

        // Вывод результатов
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }

}
