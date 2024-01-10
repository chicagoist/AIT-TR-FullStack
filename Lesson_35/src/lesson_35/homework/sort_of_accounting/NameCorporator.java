package lesson_35.homework.sort_of_accounting;

import java.util.Comparator;
import lesson_35.classwork.practice.Animal;

public class NameCorporator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {

        if(o1.getFirstName().equals(o2.getFirstName())) {
            return Integer.compare(o1.getId(),(o2.getId()));
        }else {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }

    }
}
