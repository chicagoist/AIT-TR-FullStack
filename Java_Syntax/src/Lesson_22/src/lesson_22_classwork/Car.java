package lesson_22_classwork;

public class Car {

    private String name;
    private static int counter;

    public Car(String name) {
        this.name = name;
        counter++;
    }

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Car.counter = counter;
    }
}
