package lesson_21_homework;

public class Dog {

    public String dogName;
    private static int counter = 1;

    public Dog(String dogName) {
        this.dogName = dogName;
        System.out.println(getDogName() + " counter: " + counter++);
    }

    public String getDogName() {
        return this.dogName;
    }

    public static int getCounter() {// не через this.counter так тогда
        // вызывается переменная объекта, а не класса
        return counter - 1;
    }

    public String toString() {
        return "County objects of Dog's class is =" + (getCounter());
    }
}
