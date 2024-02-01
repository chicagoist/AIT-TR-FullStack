package lesson_24_homework_inheritance;

public class Truck extends Vehicle {
    private int payload;

    public Truck(String brand, String model, int year, int payload) {
        super(brand, model, year);
        this.payload = payload;
    }

    public void displayTruckInfo() {
        displayInfo();
        System.out.println("Payload capacity: " + payload + " kg");
    }
}
