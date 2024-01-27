package lesson_47.homework;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class Task1 {
    /*
     Пусть есть класс Person с полями имя и
    возраст.Написать метод, принимающий список Person и возвращающий
    мапу, где возраст является ключом, а лист людей этого возраста значением
    */
    protected static Map<Integer, List<String>> creatorMapOfPerson(List<Person> list) {
        return list.stream().collect(groupingBy(Person::getAge,
               Collectors.mapping(Person::getName,Collectors.toList())));
    }
}
