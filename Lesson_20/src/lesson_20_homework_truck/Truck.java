package lesson_20_homework_truck;

public class Truck {

    private final String model;
    private final String manufacturer;
    private final int year;
    private final String color;
    private final int maxWeight;
    private int currentWeight = 0;
    private int currentFuel = 0;
    private final int maxFuel;
    private final String owner;
    private static final StringBuilder sb = new StringBuilder();

    public Truck(String model,
                 String manufacturer,
                 int year,
                 String color,
                 int maxWeight,
                 int maxFuel,
                 String owner) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = color;
        this.maxWeight = maxWeight;
        this.maxFuel = maxFuel;
        this.owner = owner;
    }

    private String getModel() {
        return this.model;
    }

    private String getManufacturer() {
        return this.manufacturer;
    }

    private int getMaxFuel() {
        return this.maxFuel;
    }

    public int getCurrentFuel() {
        return this.currentFuel;
    }

    private int getMaxWeight() {
        return this.maxWeight;
    }

    private String getColor() {
        return this.color;
    }

    private int getOfYear() {
        return this.year;
    }


    public void printRemainingCapacity() {
        System.out.println("Current weight: " + getCurrentWeight());
    }

    private int getCurrentWeight() {
        return this.maxWeight - this.currentWeight;
    }

    private void setCurrentWeight(int weight) {
        this.currentWeight += weight;
    }


    public void load(int weight) throws java.lang.Exception {

        if(weight <= maxWeight) {
            for(int i = 0; i <= 100; i++) {
                sb.setLength(0);
                for(int j = 0; j < i; j++) {
                    sb.append("#");
                }
                Thread.sleep(100);
                System.out.print("[" + String.format("%d tons loading  %-100s" +
                        " ", weight, sb) + "] " + i + "%");
                System.out.print("\r");
                setCurrentWeight(weight);
            }
        } else {
            System.out.println("Too much load " + weight);
            Runtime.getRuntime().exit(weight);
        }
    }


    public void unload(int unloadingWeight) throws InterruptedException {

        if(unloadingWeight <= maxWeight && unloadingWeight <= currentWeight) {
            for(int i = 0; i <= 100; i++) {
                sb.setLength(0);
                for(int j = 0; j < i; j++) {
                    sb.append("#");
                }
                Thread.sleep(100);
                System.out.print("[" + String.format("%d tons unloading  " +
                        "%-100s ", unloadingWeight, sb) + "] " + i + "%");
                System.out.print("\r");
                setCurrentWeight(getCurrentWeight() - unloadingWeight);
            }
        } else {
            System.out.println("Too much unload " + unloadingWeight);
            Runtime.getRuntime().exit(unloadingWeight);
        }
        System.out.print("\r");
    }

    public boolean move() {
        return (getCurrentFuel() != 0);
    }


    public boolean stop() {
        return (getCurrentFuel() == 0);
    }

    public void fillFuel(int currentFuel) {
        if((currentFuel + this.currentFuel) <= getMaxFuel()) {
            this.currentFuel += currentFuel;
        } else {
            System.out.println("The fuel is over capacity");
            return;
            //Runtime.getRuntime().exit(currentFuel);
        }
    }

    public String getOwner() {
        return this.owner;
    }

    public String toString() {
        return "\nThe trucks owner is: "
                + getOwner()
                + ", year of produce is: "
                + getOfYear()
                + ", model is: "
                + getModel()
                + ", manufacturer is: "
                + getManufacturer()
                + ", color is: "
                + getColor()
                + ", maxWeight is: "
                + getMaxWeight()
                + ", currentWeight is: "
                + getCurrentWeight()
                + ", currentFuel is: "
                + getCurrentFuel()
                + ", maxFuel is: "
                + getMaxFuel();
    }
}


