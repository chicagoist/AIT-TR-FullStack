package lesson_34.homework.sort_for_accounting;

/* В проекте Accounting добавить возможность сортировки сотрудников по фамилии.
(Вам может понадобится вариант метода sort, принимающий массив и индексы
элементов начала и конца сортировки)
 */


// РЕАЛИЗАЦИЯ
// class Employee: public int compareTo(Employee obj)
// class Company:  public void sort()

public class Main {

    public static void main(String[] args) {
        Company company = new Company();

        Employee salesManagerJohn = new SalesManager(1, "John", "Young", 160,
                20000, 0.1);

        Employee salesManagerJurgen = new SalesManager(4, "Jurgen", "Flint",
                100, 25000, 0.3);

        Employee freeLancerJane = new WageEmployee(2, "Jane", "Smith", 160, 25);
        Employee freeLancerHuan = new WageEmployee(4, "Huan", "Mac", 60, 40);

        company.addEmployee(salesManagerJohn);
        company.addEmployee(salesManagerJurgen);
        company.addEmployee(freeLancerJane);
        company.addEmployee(freeLancerHuan);


        System.out.println("\nTotal list of all employees before sorting: ");
        company.display();

        company.sort(); // тут сортировка по фамилии

        System.out.println("\nTotal list of all employees after sorting: ");
        company.display();
    }
}

/* OUTPUT

Total list of all employees:
SalesManager{salesVolume=20000.0, percent=0.1}Employee{id=1,firstName='John', lastName='Young', hour=160.0}
SalesManager{salesVolume=25000.0, percent=0.3}Employee{id=4,firstName='Jurgen', lastName='Flint', hour=100.0}
WageEmployee{wage=25.0}Employee{id=2, firstName='Jane', lastName='Smith',hour=160.0}
WageEmployee{wage=40.0}Employee{id=4, firstName='Huan', lastName='Mac',hour=60.0}

Total list of all employees:
SalesManager{salesVolume=25000.0, percent=0.3}Employee{id=4,firstName='Jurgen', lastName='Flint', hour=100.0}
WageEmployee{wage=40.0}Employee{id=4, firstName='Huan', lastName='Machete',hour=60.0}
WageEmployee{wage=25.0}Employee{id=2, firstName='Jane', lastName='Smith',hour=160.0}
SalesManager{salesVolume=20000.0, percent=0.1}Employee{id=1,firstName='John', lastName='Young', hour=160.0}

Process finished with exit code 0


 */
