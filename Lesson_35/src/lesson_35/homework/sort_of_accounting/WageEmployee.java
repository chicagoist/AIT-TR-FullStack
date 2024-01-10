package lesson_35.homework.sort_of_accounting;

import java.util.Comparator;

// Класс WageEmployee наследуется от Employee
public class WageEmployee extends Employee {

    private final double wage;

    public WageEmployee(int id, String firstName, String lastName,
                        double hour, double wage) {
        super(id, firstName, lastName, hour);
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    @Override
    public double calculateSalary() {
        double salary = getHour() * wage;
        if(salary < getHour() * getMinWage()) {
            salary = getHour() * getMinWage();
        }
        return salary;
    }

    @Override
    public String toString() {
        return "WageEmployee{" +
                "wage=" + wage +
                '}' + super.toString();
    }
}