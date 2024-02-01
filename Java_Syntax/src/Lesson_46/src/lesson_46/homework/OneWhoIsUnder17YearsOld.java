package lesson_46.homework;

import java.util.List;

public class OneWhoIsUnder17YearsOld {

    public static void finderYounger(List<Person> listOfPersons) {
        listOfPersons.stream().filter(person -> person.age < 17).forEach(person -> {
            System.out.println(person.name);
        });
    }

}
