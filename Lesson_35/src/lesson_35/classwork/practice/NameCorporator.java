package lesson_35.classwork.practice;

import java.util.Comparator;

public class NameCorporator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
