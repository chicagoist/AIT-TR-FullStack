package lesson_33_classwork_accounting;

// Класс SalesManager наследуется от Employee
public class SalesManager extends Employee {

    private final double salesVolume;
    private final double percent;

    public SalesManager(int id, String firstName, String lastName,
                        double hour, double salesVolume, double percent) {
        super(id, firstName, lastName, hour);
        this.salesVolume = salesVolume;
        this.percent = percent;
    }

    public double getSalesVolume() {
        return salesVolume;
    }

    public double getPercent() {
        return percent;
    }

    @Override
    public double calculateSalary() {
        double salary = salesVolume * percent;
        if(salary < getHour() * getMinWage()) {
            salary = getHour() * getMinWage();
        }
        return salary;
    }

    @Override
    public String toString() {
        return "SalesManager{" +
                "salesVolume=" + salesVolume +
                ", percent=" + percent +
                '}' + super.toString();
    }
}