package lesson_35.classwork.practice;

import java.util.Comparator;

public class LastCharacterOfNameComporator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        String reverseNameo1 =
                new StringBuilder(o1.getName()).reverse().toString();
        String reverseNameo2 =
                new StringBuilder(o2.getName()).reverse().toString();

        return reverseNameo1.compareTo(reverseNameo2);
    }
}
