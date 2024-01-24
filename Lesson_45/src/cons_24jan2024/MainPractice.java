package cons_24jan2024;

/*import java.util.function.Function;
import java.util.function.Predicate;
*/

public class MainPractice {

    public static void main(String[] args) {
        String str = "aaa BBBB dDD eeEEe lll";
        //   Predicate<String> predicate = (s) -> s.length() == 3;
        //  Function<String, String> function = String::toUpperCase;

/*        String result1 = Practice.transformer("aaa BBBB dDD eeEEe lll",
                s -> s.length() == 3,
                s -> s.toUpperCase());
        */
        //  String result1 = Practice.transformer(str, predicate, function);

        String result2 = Practice.transformer(str,
                s -> s.length() == 4,
                s -> s.toLowerCase());

        String result3 = Practice.transformer(str,
                s -> s.length() == 5,
                s -> "*****");

        // Вывод результатов
        //    System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }

}
