package lesson_20_homework_truck;

public class Main {
    public static void main(String[] args) throws Exception {
        Truck truck = new Truck("Cargo","MAN", 2020,"Orange",20,300,"John");
        truck.load(20);
        truck.unload(10);
        truck.fillFuel(200);
        truck.printRemainingCapacity();
        System.out.println(truck);
        System.out.println(truck);
    }
}
