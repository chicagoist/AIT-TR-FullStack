package lesson_35.homework.sort_of_accounting;

// Абстрактный класс Employee
public abstract class Employee implements Comparable<Employee> {
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

  public int compareTo(Employee obj) {
    return Integer.compare(this.getId(), obj.getId());
  }

  @Override
  public String toString() {
    return "Employee{"
        + "id="
        + getId()
        + ", firstName='"
        + getFirstName()
        + '\''
        + ", lastName='"
        + getLastName()
        + '\''
        + ", hour="
        + getHour()
        + '}';
  }
}
