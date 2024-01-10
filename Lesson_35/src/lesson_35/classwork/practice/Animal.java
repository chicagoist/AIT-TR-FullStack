package lesson_35.classwork.practice;

public class Animal implements Comparable<Animal> {

    private String name;
    private String color;
    private int weight;

    public Animal(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Animal o) {
        return this.getName().compareTo(o.getName());
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + getName() + '\'' +
                ", color='" + getColor() + '\'' +
                ", weight=" + getWeight() +
                '}';
    }
}
