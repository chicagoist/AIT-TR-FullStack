package lesson_02_homework;

public class Main {

  public static void main(String[] args) {

    Person myPerson = new Person();
    System.out.println("Меня зовут " + myPerson.name);
    System.out.println("Мне " + myPerson.age + " лет");
    System.out.println("Я из " + myPerson.country);
  }
}
