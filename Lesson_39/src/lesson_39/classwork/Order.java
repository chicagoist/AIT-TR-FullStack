package lesson_39.classwork;

import java.util.Objects;

public class Order {
  private int id;
  private String name;

  public Order(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public boolean equals(Object obj) {
    if (this == obj) return true;
    if(!(obj instanceof Order)) return false;

    Order order = (Order) obj;

    return  this.id == order.id && this.name.equals(order.name);

}
  public int hashCode(Object obj) {
    //return name != null ? name.hashCode() : (this.id * Math.round(1));
    return Objects.hash(this.id,this.name);
  }

  @Override
  public String toString() {
    return id + " : " + name;
  }
}
