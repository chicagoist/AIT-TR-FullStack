package lesson_46.homework;

import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Task 1
        List<String> listOfNames = Arrays.asList("John", null, "Max", "Maria",
                "Ivan", "Maria", "Sergey", "Max", "John");
        System.out.println("---Task 1---");
        Unique.getUniqueElements(listOfNames);

        // Task 2
        Address addressFrankfurt1 = new Address(1, "KaiserStr");
        Address addressFrankfurt2 = new Address(15, "ElberStr");
        Address addressMaintal = new Address(8, "Catl-Zeiss-Str");
        Address addressHanau = new Address(15, "Freiheitsplatz");

        Person maleBorisJohnson = new Person("Johnson", 56, addressFrankfurt1);
        Person femaleKatyParry = new Person("Parry", 17, addressFrankfurt2);
        Person maleDieterBohlen = new Person("Bohlen", 16, addressMaintal);
        Person maleThomasAnders = new Person("Anders", 15, addressHanau);

        List<Person> listOfPersons = Arrays.asList(maleBorisJohnson,
                femaleKatyParry, maleDieterBohlen, maleThomasAnders);
        System.out.println("---Task 2---");
        OneWhoIsUnder17YearsOld.finderYounger(listOfPersons);
    }
}
/* OUTPUT


 */