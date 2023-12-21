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

        Shape rectangle1 = new Rectangle(10.5, 11.3);
        System.out.printf("Perimeter of rectangle = %.2f\n",
                rectangle1.calculatePerimeter());
        System.out.printf("Area of rectangle = %.2f\n",
                rectangle1.calculateArea());

        System.out.println(" ");

        Shape circle1 = new Circle(10.5);
        System.out.printf("Perimeter of circle = %.2f\n",
                circle1.calculatePerimeter());
        System.out.printf("Area of circle = %.2f\n",
                circle1.calculateArea());

        Shape[] shapes = {circle1, rectangle1};

        System.out.printf("Total sum of all shapes " +
                "= %.2f\n", calculateTotalAreaOfShapes(shapes));
    }

    private static double calculateTotalAreaOfShapes(Shape[] shapes) {
        double totalSumOfArea = 0;

        for(Shape figure : shapes) {
            totalSumOfArea += figure.calculateArea();
        }

        return totalSumOfArea;
    }
}

/*OUTPUT

Perimeter of rectangle = 43,60
Area of rectangle = 118,65

Perimeter of circle = 65,97
Area of circle = 346,36
Total sum of all shapes = 465,01

Process finished with exit code 0


 */