package lesson_35.homework.sort_of_accounting;

/* В проекте Accounting добавить дополнительные возможности сортировки
сотрудников:
1.по id,
2.по имени и если имена одинаковые то по id.
 */


// РЕАЛИЗАЦИЯ
// class NameCorporator and method compare()
// class IdCorporator and method compare()
// class Company and method sort()


public class Main {

    public static void main(String[] args) {
        Company company = new Company();

        Employee salesManagerJohn = new SalesManager(1, "John", "Young", 160,
                20000, 0.1);

        Employee salesManagerJurgen = new SalesManager(4, "Jurgen", "Flint",
                100, 25000, 0.3);

        Employee freeLancerJane = new WageEmployee(2, "Jane", "Smith", 160, 25);
        Employee freeLancerJane2 = new WageEmployee(4, "Jane", "Mac", 60, 40);
        Employee freeLancerJane3 = new WageEmployee(3, "Jane", "Dou", 160, 140);

        company.addEmployee(salesManagerJohn);
        company.addEmployee(salesManagerJurgen);
        company.addEmployee(freeLancerJane);
        company.addEmployee(freeLancerJane2);
        company.addEmployee(freeLancerJane3);

        NameCorporator nameCorporator = new NameCorporator();
        IdCorporator idCorporator = new IdCorporator();


        System.out.println("\nTotal list of all employees after sorting by " +
                "name: ");
        company.sort(nameCorporator);
        company.display();

        System.out.println("\nTotal list of all employees after sorting by " +
                "id: ");
        company.sort(idCorporator);
        company.display();

    }
}

/* OUTPUT
Total list of all employees after sorting by name:
WageEmployee{wage=25.0}Employee{id=2, firstName='Jane', lastName='Smith',
hour=160.0}
WageEmployee{wage=140.0}Employee{id=3, firstName='Jane', lastName='Dou',
hour=160.0}
WageEmployee{wage=40.0}Employee{id=4, firstName='Jane', lastName='Mac',
hour=60.0}
SalesManager{salesVolume=20000.0, percent=0.1}Employee{id=1,
firstName='John', lastName='Young', hour=160.0}
SalesManager{salesVolume=25000.0, percent=0.3}Employee{id=4,
firstName='Jurgen', lastName='Flint', hour=100.0}

Total list of all employees after sorting by id:
SalesManager{salesVolume=20000.0, percent=0.1}Employee{id=1,
firstName='John', lastName='Young', hour=160.0}
WageEmployee{wage=25.0}Employee{id=2, firstName='Jane', lastName='Smith',
hour=160.0}
WageEmployee{wage=140.0}Employee{id=3, firstName='Jane', lastName='Dou',
hour=160.0}
WageEmployee{wage=40.0}Employee{id=4, firstName='Jane', lastName='Mac',
hour=60.0}
SalesManager{salesVolume=25000.0, percent=0.3}Employee{id=4,
firstName='Jurgen', lastName='Flint', hour=100.0}

Process finished with exit code 0


 */
