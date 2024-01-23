package lesson_44.classwork;
/*
Пусть есть текстовый файл такого вида

    Peter,37

    Simon, 5

    John, 90

    Нужно написать метод, читающий этот файл и возвращающий лист людей старше 18 лет, отсортированный

    по возрасту. Известно, что файл не пустой

    List<Person>

 */


import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Person> sortedPersons = Person.composeList("people.txt");
        for(Person person : sortedPersons) {
            System.out.println(person);

        }
    }
}
