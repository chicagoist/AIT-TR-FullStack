package lesson_33_classwork_accounting;

// Класс WageEmployee наследуется от Employee
public class WageEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public double getHourlyRate() {
        return hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public WageEmployee(String name, String secondname, double hourlyRate,
                        int hoursWorked, int id) {
        this.setName(name);
        this.setSecondName(secondname);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
        //this.hours = hours;
        this.setId(id);
    }

    @Override
    public double calculateSalary() {

        double salary = getHoursWorked() * getHourlyRate();
        if(salary <= getHoursWorked()*Employee.MIN_WAGE){
            salary = getHoursWorked()*Employee.MIN_WAGE;
        }
        return salary;
    }

    @Override
    public String toString() {
        return "WageEmployee{" +
                "hours=" + hours +
                ", hourlyRate=" + hourlyRate +
                ", hoursWorked=" + hoursWorked +
                super.toString() +
                '}';
    }
}
