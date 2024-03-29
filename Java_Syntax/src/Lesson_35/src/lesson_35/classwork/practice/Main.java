package lesson_35.classwork.practice;

import java.util.ArrayList;
import java.util.List;

/*
    Создать класс Animal c полями name, weight, colour.
    Используя компараторы вывести на экран в классе Main  список животных, упорядоченный по
    следующим параметрам:
    -по имени
    -по весу
    - список названий животных, упорядоченный по возрастанию последней буквы имени
    Wolf
    Bear
    Elephant
    Anakonda
    Fox


Anakonda
Wolf
Bear
Elephant
Fox
     */

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
        System.out.println("Without sorting: ");
        for(Animal animal : animals) {
            System.out.println(animal);
        }

        System.out.println();
        System.out.println("After weight's sorting: ");
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
            System.out.println(animal.getName());

        }
    }
}

/* OUTPUT

Without sorting:
Animal{name='wolf', color='Gray', weight=50}
Animal{name='bear', color='Braun', weight=200}
Animal{name='fox', color='Red', weight=5}
Animal{name='anaconda', color='Camoo', weight=150}

After weigt's sorting:
Animal{name='fox', color='Red', weight=5}
Animal{name='wolf', color='Gray', weight=50}
Animal{name='anaconda', color='Camoo', weight=150}
Animal{name='bear', color='Braun', weight=200}

After name's sorting:
Animal{name='anaconda', color='Camoo', weight=150}
Animal{name='bear', color='Braun', weight=200}
Animal{name='fox', color='Red', weight=5}
Animal{name='wolf', color='Gray', weight=50}

After last name's character sorting:
anaconda
wolf
bear
fox

Process finished with exit code 0



 */
