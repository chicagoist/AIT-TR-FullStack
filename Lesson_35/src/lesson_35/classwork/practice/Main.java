package lesson_35.classwork.practice;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal wolf = new Animal("wolf", "Gray", 50);
        Animal bear = new Animal("bear", "Braun", 200);
        Animal fox = new Animal("fox", "Red", 5);
        Animal anaconda = new Animal("anaconda", "Camoo", 150);

        List<Animal> animals = new ArrayList<>();

        animals.add(wolf);
        animals.add(bear);
        animals.add(fox);
        animals.add(anaconda);

        WeightComporator weightComporator = new WeightComporator();
        NameCorporator nameCorporator = new NameCorporator();
        LastCharacterOfNameComporator lastCharacterOfNameComporator =
                new LastCharacterOfNameComporator();



        System.out.println();
        System.out.println("After weigt's sorting: ");
        animals.sort(weightComporator);

        for(Animal animal : animals) {
            System.out.println(animal);

        }

        System.out.println();
        System.out.println("After name's sorting: ");
        animals.sort(nameCorporator);

        for(Animal animal : animals) {
            System.out.println(animal);

        }

        System.out.println();
        System.out.println("After last name's character sorting: ");
        animals.sort(lastCharacterOfNameComporator);

        for(Animal animal : animals) {
            System.out.println(animal);

        }


    }
}
