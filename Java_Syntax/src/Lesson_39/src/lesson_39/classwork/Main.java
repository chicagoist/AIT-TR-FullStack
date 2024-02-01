package lesson_39.classwork;

public class Main {
    public static void main(String[] args){
        Order order1 = new Order(2, "order");
        Order order2 = new Order(2, "order");

        System.out.println(order1 == order2);
        System.out.println(order1.equals(order2));

        System.out.println(order1.toString());
        System.out.println(order2.toString());




        // Нужно переjghtltkznm метод equals

        System.out.println("order1.hashCode() = " + order1.hashCode());
        System.out.println("order2.hashCode() = "+order2.hashCode());


    }
}
