package lesson_33_classwork_accounting;

// Абстрактный класс Employee
public abstract class Employee {
    private static final double MIN_WAGE = 8.0;
    private int id;
    private String firstName;
    private String lastName;
    private double hour;

    public Employee(int id, String firstName, String lastName, double hour) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.hour = hour;
    }

    public abstract double calculateSalary();

    public double getMinWage() {
        return MIN_WAGE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getHour() {
        return hour;
    }


    public void setHour(double hour) {
        this.hour = hour;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", hour=" + hour +
                '}';
    }


}
