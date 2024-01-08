package lesson_33_classwork_accounting;

/* UML
+------------------------------------------+
|                  Company                 |
+------------------------------------------+
| - employees: List<Employee>              |
+------------------------------------------+
| + addEmployee(Employee): boolean         |
| + removeEmployee(Employee): boolean      |
| + display(): void                        |
| + sumSalary(): double                    |
| + getEmployees(): List<Employee>         |
+------------------------------------------+

+------------------------------------------+
|                Employee                  |
+------------------------------------------+
| - id: int                                |
| - firstName: String                      |
| - lastName: String                       |
| - hour: double                           |
+------------------------------------------+
| + Employee(id: int, firstName: String,   |
|   lastName: String, hour: double)        |
| + abstract calculateSalary(): double     |
| + getters and setters                    |
| + toString(): String                     |
+------------------------------------------+

+------------------------------------------+
|            WageEmployee                  |
+------------------------------------------+
| - wage: double                           |
+------------------------------------------+
| + WageEmployee(id: int, firstName:      |
|   String, lastName: String, hour:       |
|   double, wage: double)                  |
| + getWage(): double                      |
| + calculateSalary(): double              |
| + toString(): String                     |
+------------------------------------------+

+------------------------------------------+
|           SalesManager                   |
+------------------------------------------+
| - salesVolume: double                    |
| - percent: double                        |
+------------------------------------------+
| + SalesManager(id: int, firstName:      |
|   String, lastName: String, hour:       |
|   double, salesVolume: double,           |
|   percent: double)                       |
| + getSalesVolume(): double               |
| + getPercent(): double                   |
| + calculateSalary(): double              |
| + toString(): String                     |
+------------------------------------------+


 */

/*

Создать программу для бухгалтерии, которая сможет делать следующее:
    1. добавлять сотрудников в штат
    2. удалять сотрудников из штата
    3. рассчитывать зарплату для двух категорий сотрудников
            - сотрудник с почасовой оплатой
            - менеджер по продажам
     4. Добавление и удаление сотрудников  а также методы для вывода на экран
      списка сотрудников  и суммирования
        зарплат всех сотрудников  должны находиться в классе Company
5. В программе должны также быть классы WageEmployee  и SalesManager  с
полями id, name, secondName,
        количество проработанных часов а также метод для расчета зарплаты
     6.  У сотрудника на почасовой оплате должно быть поле ставка за час.
     Метод расчета его зарплаты должен
            учитывать минимальный размер оплаты труда
      7. У менеджера по продажам нет фиксированной оплаты , его  зарплата
      рассчитывается как процент от обьема продаж
            Но его метод оплаты труда также должен учитывать минимальный
            размер оплаты труда
       8. Программа должна быть написана с использованием свойств наследования
 */


public class Main {

    public static void main(String[] args) {
        Company company = new Company();

        Employee salesManager1 = new SalesManager(1, "John", "Doe", 160, 20000, 0.1);
        Employee freeLancer1 = new WageEmployee(2, "Jane", "Smith", 160, 25);

        company.addEmployee(salesManager1);
        company.addEmployee(freeLancer1);

        System.out.println("\nTotal salary for all employees: " + company.sumSalary());

        System.out.println("Salary for each employee:");
        for (Employee emp : company.getEmployees()) {
            System.out.println(emp.getFirstName() + " " + emp.getLastName() +
                    ": " + emp.calculateSalary());
            }

        System.out.println("toString for each employee:");
        for (Employee emp : company.getEmployees()) {
            System.out.println(emp.toString() + ", calculateSalary = " + emp.calculateSalary());
        }

        // Удаляем одного из сотрудников
        if (!company.getEmployees().isEmpty()) { // проверяем на ошибку
//            Employee employeeToRemove =
//                    company.getEmployees().get(freeLancer1.getId());

            company.removeEmployee(freeLancer1);
            System.out.println("\nRemoved employee: " + freeLancer1.getFirstName() +
                    " " + freeLancer1.getLastName());

            System.out.println("Total salary after removing one employee: " + company.sumSalary());
        } else {
            System.out.println("\nNo employees to remove.");
        }

        System.out.println("Salary for each employee:");
        for (Employee emp : company.getEmployees()) {
            System.out.println(emp.getFirstName() + " " + emp.getLastName() + ": " + emp.calculateSalary());
        }
    }
}

