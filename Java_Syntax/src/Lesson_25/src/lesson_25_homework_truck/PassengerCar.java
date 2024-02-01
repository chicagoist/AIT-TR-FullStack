package lesson_25_homework_truck;

public class PassengerCar extends Vehicle {

    private int numberOfPassengers = 0;
    private int numberOfDoors = 0;
    private int maxFuel = 0;

    public PassengerCar(String model, String manufacturer, int year,
                        String color,
                        int maxWeight, int maxFuel, int numberOfPassengers,
                        int numberOfDoors) {

        super(model, manufacturer, year, color, maxWeight);

        this.numberOfPassengers = numberOfPassengers;
        this.numberOfDoors = numberOfDoors;
        this.maxFuel = maxFuel;
    }

    protected void infoOfPassengerCar() {
        System.out.println("The model is " + "\"" + model + "\"" + ", " +
                "manufactured by " + "\"" + manufacturer + "\"" + ", " +
                "production year is " + year + ", maximum load is " + maxWeight
                + "kg" + ", max fuel is " + maxFuel + ", number of passenger " +
                "is " + numberOfPassengers + ", number of doors is " + numberOfDoors);
    }
}
