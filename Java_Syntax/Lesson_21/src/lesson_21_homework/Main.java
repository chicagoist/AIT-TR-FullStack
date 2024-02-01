package lesson_21_homework;

/*
Задача 1

Создать класс Dog c полями name , counter и конструктором. Cоздать несколько
обьектов этого класса и вывести на печать количество созданных обьектов.
 */
public class Main {

    public static void main(String[] args) {
        Dog dog1 = new Dog("Dog1");
        Dog dog2 = new Dog("Dog2");
        Dog dog3 = new Dog("Dog3");
        Dog dog4 = new Dog("Dog4");

        System.out.println("County objects of Dog's class is = " + Dog.getCounter());


    }

}
