package lesson_35.homework.sort_of_accounting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Company {

    private final List<Employee> employees; // создаём списочный массив для
    // удобства работы

    public Company() {
        employees = new ArrayList<>(); // инициализируем массив в конструкторе
    }

    public boolean addEmployee(Employee employee) {
        return employees.add(employee);
    }

    public boolean removeEmployee(Employee employee) {
        if(employees.contains(employee)) { // проверка на ошибку
            employees.remove(employee);
            return true; // обязательно выводить true ?
        } else {
            return false;
        }
    }

    public void display() {
        for(Employee emp : employees) {
            System.out.println(emp);
        }
    }

    public double sumSalary() {
        double sum = 0;
        for(Employee emp : employees) {
            sum += emp.calculateSalary();
        }
        return sum;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void sort(Comparator<Employee> comparator) {
        employees.sort(comparator);
    }

}
