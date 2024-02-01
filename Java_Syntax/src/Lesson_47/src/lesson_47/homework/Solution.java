package lesson_47.homework;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        /*
         Пусть есть класс Person с полями имя и
        возраст.Написать метод, принимающий список Person и возвращающий
        мапу, где возраст является ключом, а лист людей этого возраста значением
        */

        Person person1 = new Person("Johnson", 56);
        Person person2 = new Person("Parry", 19);
        Person person3 = new Person("Bohlen", 16);
        Person person4 = new Person("Anders", 15);
        Person person5 = new Person("Anders", 15);

        List<Person> personList = Arrays.asList(person1, person2,
                person3, person4, person5);

        Map<Integer, List<String>> returnnedMap =
                Task1.creatorMapOfPerson(personList);

        System.out.println("Task 1");
        System.out.println(returnnedMap);

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
        System.out.println("Task 2a");

        int sumOfAge = Task2.summationOfAges(personList);
        System.out.println(sumOfAge);

        System.out.println("Task 2b");
        String namesOlderThan18 = Task2.returningNames(personList);
        System.out.println(namesOlderThan18);

        /*
Написать метод, принимающий в качестве параметров две строки. Первая строка
состоит из слов, разделенных пробелом. Метод возвращает количество слов
первой строки, начинающихся со второй строки
Пример : Первая строка "aaaaaaa cccc ab bbbbb a ff aaa"
Если вторая строка а, то ответ 4
Если вторая строка ааа, ответ 2
Если вторая строка aaaa, ответ 1          */
        System.out.println("Task 3");

        String str = "aaaaaaa сссс ab bbbbb a ff aaa";
        int count1 = Task3.findNumberOfWordsOftheFirstString(str,"aaa");
        System.out.println(count1);
        int count2 = Task3.findNumberOfWordsOftheFirstString(str,"aa");
        System.out.println(count2);
        int count3 = Task3.findNumberOfWordsOftheFirstString(str,"a");
        System.out.println(count3);
        int count4 = Task3.findNumberOfWordsOftheFirstString(str,"сс");
        System.out.println(count4);


    }
}
