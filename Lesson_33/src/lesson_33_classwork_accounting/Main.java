package lesson_33_classwork_accounting;

/* UML
 _____________________         _____________________
|       Employee      |       |      Company        |
| - id: int           |       | - employees: List<> |
| - name: String      |       |_____________________|
| - secondName: String|
|_____________________|
          |
    ______|______
   |             |
   | WageEmployee|
   |_____________|
          |
    ______|______
   |             |
   |SalesManager |
   |_____________|

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

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Employee worker1 = new WageEmployee("Ivan", "Ivanov", 16, 8, 35);
        employees.add(worker1);
        Company accountingForWorkers = new Company(employees);
        System.out.println(accountingForWorkers.calculateTotalSalaries());
        accountingForWorkers.displayEmployees();


    }
}
