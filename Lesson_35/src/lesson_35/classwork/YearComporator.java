package lesson_35.classwork;

import java.util.Comparator;

public class YearComporator implements Comparator<Author> {
    @Override
    public int compare(Author o1, Author o2) {
        return Integer.compare(o1.getYear(), o2.getYear());
    }
}
