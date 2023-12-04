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
        return name;
    }

    public int getAge() {
        return age;
    }


    public static void main(String[] args) {

        Student firstStudent = new Student();
        System.out.println("Default student have a name: " + "\"" + firstStudent.name + "\"" + " and age: " + firstStudent.age);

        //Ivan, 33 y.o.
        Student secondStudent = new Student();
        secondStudent.setName("Ivan");
        secondStudent.setAge(33);
        System.out.println("Second student have a name: " + "\"" + secondStudent.getName() + "\"" + " and age: " + secondStudent.getAge());

        //Sergey, 20y.o.
        Student thirdStudent = new Student();
        thirdStudent.setName("Sergey");
        thirdStudent.setAge(20);
        System.out.println("Third student have a name: " + "\"" + thirdStudent.getName() + "\"" + " and age: " + thirdStudent.getAge());

        //Oksana, 25y.o.
        Student fourthStudent = new Student();
        fourthStudent.setName("Oksana");
        fourthStudent.setAge(25);
        System.out.println("Fourth student have a name: " + "\"" + fourthStudent.getName() + "\"" + " and age: " + fourthStudent.getAge());

    }
}
