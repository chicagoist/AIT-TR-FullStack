package de.aitschule;

public class Main {

    public static void main(String[] args) {

        Person myPerson = new Person();
        System.out.println("Меня зовут " + myPerson.name);
        System.out.println("Мне " + myPerson.age + " лет");
        System.out.println("Я из " + myPerson.country);
    }

    private static class Person {
        String name = "Вальдемар";
        int age = 48;
        String country = "Германия";
    }

}
