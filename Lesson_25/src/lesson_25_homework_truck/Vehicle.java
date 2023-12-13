package lesson_25_homework_truck;

public class Vehicle {

    protected String model;
    protected String manufacturer;
    protected int year;
    protected String color;
    protected int maxWeight;

    public Vehicle(String model, String manufacturer, int year, String color,
                   int maxWeight) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = color;
        this.maxWeight = maxWeight;
    }

    public void infoOfVehicle() {
        System.out.println("The model is " + "\"" + model + "\"" + ", " +
                "manufactured by " + "\"" + manufacturer + "\"" + ", " +
                "production year is " + year + ", maximum load is "
                + maxWeight + "kg" + ", the color is " + color);
    }


    protected void infoOfPassengerCar() {}

    protected void infoOfTruck() {}
}
