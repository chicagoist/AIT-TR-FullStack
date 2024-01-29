package lesson_47.homework;

import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

    protected static int sum = 0;

    protected static int summationOfAges(List<Person> list) {
        return list
                .stream()
                .filter(age -> age.getAge() > 18)
                .map(Person::getAge)
                .reduce(sum, Integer::sum);
    }

    protected static String returningNames(List<Person> list) {
        boolean hasLegalAge = list.stream()
                .anyMatch(p -> p.getAge() > 18);

        if (!hasLegalAge) {
            return "No one is of legal age";
        }

        List<String> names = list.stream()
                .filter(p -> p.getAge() > 18)
                .map(Person::getName)
                .collect(Collectors.toList());

        return "At the moment " + String.join(" and ", names) + " are of legal age";
    }
}

        /*
        Есть тот же класс Person с полями String name, int age.

    2a. Написать метод,принимающий список Person и возвращающий суммарный
    возраст
     тех, кто старше 18 лет.

    2b. Написать метод,принимающий список Person и возвращающий имена тех, кто
    старше 18 лет в виде такой строки:
    "At the moment John and Ann and Bill are of legal age "
    ( имена и текст могут быть любыми, по вашему выбору, структура
    предложения должна сохраняться)

         */
