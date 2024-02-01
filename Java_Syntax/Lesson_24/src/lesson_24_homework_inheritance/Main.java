package lesson_24_homework_inheritance;

public class Main {
    public static void main(String[] args) {
        Car carOne = new Car("Ford", "Mustang", 1974, 2);
        Truck truckOne = new Truck("Dodge", "RAM", 2023, 5000);
        System.out.println("carOne.displayCarInfo():");
        carOne.displayCarInfo();
        System.out.println("\ncarOne.displayInfo():");
        carOne.displayInfo();
        System.out.println("\ntruckOne.displayTruckInfo():");
        truckOne.displayTruckInfo();
        System.out.println("\ntruckOne.displayInfo():");
        truckOne.displayInfo();
    }
}
