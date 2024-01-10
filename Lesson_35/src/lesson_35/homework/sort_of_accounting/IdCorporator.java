package lesson_35.homework.sort_of_accounting;

import java.util.Comparator;

public class IdCorporator implements Comparator<Employee>  {


    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getId(),(o2.getId()));
    }
}
