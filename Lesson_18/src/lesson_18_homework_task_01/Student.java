package lesson_18_homework_task_01;

/*
Задача 1
Создать класс Student c полями (переменными) имя и возраст.
Создать несколько обьектов этого класса. Вывести их на печать 
 */

public class Student {
    private String name = "";
    private int age = 0;

    public Student() {

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

}
