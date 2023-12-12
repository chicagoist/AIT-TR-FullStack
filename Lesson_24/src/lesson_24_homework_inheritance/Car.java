package lesson_24_homework_inheritance;

public class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, String model, int year, int numDoors) {
        super(brand, model, year);
        this.numDoors = numDoors;
    }

    public void displayCarInfo() {
        displayInfo();
        System.out.println("Number of doors: " + numDoors);
    }
}
