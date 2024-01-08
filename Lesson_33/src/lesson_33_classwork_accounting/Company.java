package lesson_33_classwork_accounting;

import java.util.List;

public class Company {
    private List<Employee> employees;

    public Company(List<Employee> employees) {
        this.employees = employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void displayEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }

    public double calculateTotalSalaries() {
        double totalSalaries = 0.0;
        for (Employee employee : employees) {
            totalSalaries += employee.calculateSalary();
        }
        return totalSalaries;
    }

/*    @Override
    public String toString() {
        return "Company{"+ displayEmployees() +
                '}';
    }*/
}
