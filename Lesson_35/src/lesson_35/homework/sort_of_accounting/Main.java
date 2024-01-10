package lesson_35.homework.sort_of_accounting;

/* В проекте Accounting добавить дополнительные возможности сортировки сотрудников:
1.по id,
2.по имени и если имена одинаковые то по id.
 */


// РЕАЛИЗАЦИЯ


public class Main {

    public static void main(String[] args) {
        Company company = new Company();

        Employee salesManagerJohn = new SalesManager(1, "John", "Young", 160,
                20000, 0.1);

        Employee salesManagerJurgen = new SalesManager(4, "Jurgen", "Flint",
                100, 25000, 0.3);

        Employee freeLancerJane = new WageEmployee(2, "Jane", "Smith", 160, 25);
        Employee freeLancerHuan = new WageEmployee(4, "Jane", "Mac", 60, 40);

        company.addEmployee(salesManagerJohn);
        company.addEmployee(salesManagerJurgen);
        company.addEmployee(freeLancerJane);
        company.addEmployee(freeLancerHuan);


        System.out.println("\nTotal list of all employees before sorting: ");
        company.display();

        System.out.println("\nTotal list of all employees after sorting: ");
        company.display();
    }
}

/* OUTPUT



 */
