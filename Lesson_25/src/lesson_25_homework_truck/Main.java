package lesson_25_homework_truck;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("", "", 1974, "", 20000);
        Vehicle passengerCar = new PassengerCar("Lada Sputnik 2109", "VAZ",
                1998, "Red", 700, 40, 5, 5);
        Vehicle truck = new Truck("256", "KrAZ", 1974, "Green", 20000, 300,
                "GmbH " +
                        "Berlin", 5000, 150);

        vehicle.infoOfVehicle();
        passengerCar.infoOfPassengerCar();
        truck.infoOfTruck();
        /*OUT
        The model is "", manufactured by "", production year is 1974, maximum
        load is 20000kg, the color is

        The model is "Lada Sputnik 2109", manufactured by "VAZ", production year
        is 1998, maximum load is 700kg, max fuel is 40, number of passenger is
        5, number of doors is 5

        The model is "256", manufactured by "KrAZ", production year is 1974,
        maximum load is 20000kg, max fuel is 300, the current weight is 5000,
        the current fuel is 150, the owner are GmbH Berlin

         */

    }
}
