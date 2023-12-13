package lesson_25_homework_truck;

public class PassengerCar extends Vehicle {

    protected int numberOfPassengers = 0;
    protected int numberOfDoors = 0;
    protected int maxFuel = 0;

    public PassengerCar(String model, String manufacturer, int year,
                        String color,
                        int maxWeight, int maxFuel, int numberOfPassengers,
                        int numberOfDoors) {

        super(model, manufacturer, year, color, maxWeight);

        this.numberOfPassengers = numberOfPassengers;
        this.numberOfDoors = numberOfDoors;
        this.maxFuel = maxFuel;
    }

    public void infoOfPassengerCar() {
        System.out.println("The model is " + "\"" + model + "\"" + ", " +
                "manufactured by " + "\"" + manufacturer + "\"" + ", " +
                "production year is " + year + ", maximum load is " + maxWeight
                + "kg" + ", max fuel is " + maxFuel + ", number of passenger " +
                "is " + numberOfPassengers + ", number of doors is " + numberOfDoors);
    }
}
