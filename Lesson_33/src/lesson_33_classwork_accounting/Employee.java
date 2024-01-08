package lesson_33_classwork_accounting;

// Абстрактный класс Employee
public abstract class Employee<MIN_WAGE> {
    private int id;
    double hours;
    private String name;
    private String secondName;
    static double MIN_WAGE = 13.0;

/*    public Employee(int id, double hours, String name, String secondName) {
        this.id = id;
        this.hours = hours;
        this.name = name;
        this.secondName = secondName;
    }*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }

    public abstract double calculateSalary(); // Абстрактный метод для расчета зарплаты
}
