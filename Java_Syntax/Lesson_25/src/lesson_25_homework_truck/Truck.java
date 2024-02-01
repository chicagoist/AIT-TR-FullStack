package lesson_25_homework_truck;

public class Truck extends Vehicle {

    private int currentWeight = 0;
    private int currentFuel = 0;
    private String owner;
    private int maxFuel;

    public Truck(String model, String manufacturer, int year, String color,
                 int maxWeight, int maxFuel, String owner, int currentWeight,
                 int currentFuel) {

        super(model, manufacturer, year, color, maxWeight);

        this.currentWeight = currentWeight;
        this.currentFuel = currentFuel;
        this.maxFuel = maxFuel;
        this.owner = owner;
    }

    protected void infoOfTruck() {
        System.out.println("The model is " + "\"" + model + "\"" + ", " +
                "manufactured by " + "\"" + manufacturer + "\"" + ", " +
                "production year is " + year + ", maximum load is " + maxWeight
                + "kg" + ", max fuel is " + maxFuel + ", the current weight " +
                "is " + currentWeight + ", " +
                "the current fuel is " + currentFuel+ ", the owner are " + owner);
    }

}
