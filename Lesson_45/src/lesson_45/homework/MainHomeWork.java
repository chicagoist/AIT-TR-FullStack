package lesson_45.homework;

import java.util.function.*;

public class MainHomeWork {
    /*
Переписать лямбда выражения из класса Main пакета
our_interfaces (см.код) с использованием стандартных
функциональных интерфейсов
     */
    public static void main(String[] args) {

        //  используя наши интерфейсы написать такие лямбды:
        // 1. конкатинировать  a и b   и получить ab
        // 2.  если длина строки 3 вернуть true
        // 3.  если длина строки четная вернуть true  иначе false
        // 4. вернуть строку в верхнем регистре
        // 5. если длина строки 4 вернуть 4 звездочки иначе вернуть строку
        // без изменений

        // Concatable concatable = (a,b) -> Integer.toString(a) + b;
        // System.out.println(concatable.concat(1,3));
        BiFunction<Integer, Integer, String> concatable = (a, b) -> Integer.toString(a) + b;
        System.out.println(concatable.apply(1, 3));

/*      Checkable checkable = s -> s.length() == 3;
        System.out.println(checkable.check("abc"));
        System.out.println(checkable.check("abcd"));*/
        Predicate<String> isEqual = s -> s.length() == 3;
        System.out.println(isEqual.test("abc"));
        System.out.println(isEqual.test("abcd"));

        System.out.println("checkable even");
        isEqual = s -> s.length() % 2 == 0;
        System.out.println(isEqual.test("abc"));
        System.out.println(isEqual.test("abcd"));

        // Transformable transformable = String::toUpperCase;
        // System.out.println(transformable.modify("abcDe"));
        Consumer<String> transformable = s -> System.out.println(s.toUpperCase());
        transformable.accept("abcDe");

        //  Transformable transformable1 = s -> s.length() == 4 ? "****" : s;
        //  System.out.println(transformable1.modify("ab"));
        //  System.out.println(transformable1.modify("abcd"));
        UnaryOperator<String> transformable1 = s -> s.length() == 4 ? "****" : s;
        Function<String,String> transformableF =
                s -> s.length() == 4 ? "****" : s; // можно и так
        System.out.println(transformable1.apply("ab"));
        System.out.println(transformable1.apply("abcd"));

        // Printable printable = s -> System.out.println("!" + s + "!");
        // printable.print("Hello");
        Consumer<String> printable = s -> System.out.println("!" + s + "!");
        printable.accept("Hello");

        // Producable producable = () -> "Hello World";
        // System.out.println(producable.produce());
        Supplier<String> producable = () -> "Hello World";
        System.out.println(producable.get());
    }
}
/* OUTPUT
13
true
false
checkable even
false
true
ABCDE
ab
****
!Hello!
Hello World

Process finished with exit code 0
 */