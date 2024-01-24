package lesson_45.classwork;

public class Main {

    public static void main(String[] args) {

        String str = "Привет, Мир";
        Printable printable = s -> System.out.printf("!%s!\n", s);
        printable.print(str);

        Producable producable = () -> "строка";
        System.out.println(producable.produce());





    }
}
