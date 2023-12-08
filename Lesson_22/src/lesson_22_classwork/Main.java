package lesson_22_classwork;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Car1");
        Car car2 = new Car("Car2");
        Car car3 = new Car("Car3");
        Car car4 = new Car("Car4");

        System.out.println(Car.getCounter());
        System.out.println(car1.getCounter());

    }
}
