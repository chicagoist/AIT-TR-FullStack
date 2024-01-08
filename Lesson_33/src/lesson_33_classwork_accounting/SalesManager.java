package lesson_33_classwork_accounting;

// Класс SalesManager наследуется от Employee
public class SalesManager extends Employee {
  private double salesVolume;
  private double commission_KPI_Rate;

  public SalesManager(
      String name,
      String secondname,
      double salesVolume,
      double commission_KPI_Rate,
      double hours,
      int id) {
    this.setName(name);
    this.setSecondName(secondname);
    this.salesVolume = salesVolume;
    this.commission_KPI_Rate = commission_KPI_Rate;
    this.hours = hours;
    this.setId(id);
  }

  public double getSalesVolume() {
    return salesVolume;
  }

  public double getCommission_KPI_Rate() {
    return commission_KPI_Rate;
  }

  @Override
  public double calculateSalary() {
    double salary = salesVolume * commission_KPI_Rate;
    if (salary <= hours * MIN_WAGE) {
      salary = hours * MIN_WAGE;
    }
    return salary;
  }

  @Override
  public String toString() {
    return "SalesManager{"
        + "hours="
        + hours
        + ", salesVolume="
        + salesVolume
        + ", commission_KPI_Rate="
        + commission_KPI_Rate
        + super.toString()
        + '}';
  }
}
