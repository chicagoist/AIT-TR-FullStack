package lesson_31_homework_interface;
/*
Создать интерфейс Shape, содержащий методы для подсчета площади и периметра
фигуры и классы прямоугольник и круг, реализующие этот интерфейс.
В методе main создать несколько фигур и вывести на печать площадь и периметр
каждой.
Написать метод, вычисляющий общую площадь фигур нескольких видов.
 */


public class Main {
    public static void main(String[] args) {

        Shape rectangle1 = new Rectangle(10.5,11.3);
        System.out.printf("Perimeter of rectangle = %.2f\n",
                rectangle1.getPerimeterOfRectangle());
        System.out.printf("Area of rectangle = %.2f",
                rectangle1.getAreaOfRectangle());

        System.out.println(" ");

        Shape circle1 = new Circle(10.5);
        System.out.printf("Perimeter of circle = %.2f\n",
                circle1.getCircumference());
        System.out.printf("Area of circle = %.2f",
                circle1.getAreaOfcircle());

    }
}
