package lesson_18_homework_task_02;

/*
Задача 2
Создать класс Rectangle (прямоугольник), содержащий переменные длина и ширина,
конструктор и методы для подсчета площади и периметра прямоугольника.
В классе Main создать несколько обьектов класса Rectangle и вывести на экран
площадь и периметр каждого
 */
public class Rectangle {

    private int length = 0;
    private int width = 0;

    public Rectangle(int length, int width) {
        setLength(length);
        setWidth(width);
    }

    public int getLength() {
        return this.length;
    }

    public int getWidth() {
        return this.width;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int rectangleArea() {
        return getLength() * getWidth();
    }

    public int rectanglePerimeter() {
        return (2 * (getLength() + getWidth()));
    }

    public static void main(String[] args) {
        Rectangle firstRectangle = new Rectangle(10, 5);
        Rectangle secondRectangle = new Rectangle(2, 6);
        Rectangle thirdRectangle = new Rectangle(4, 4);

        System.out.println("firstRectangle has a area: " + firstRectangle.rectangleArea() + " and perimeter: " + firstRectangle.rectanglePerimeter());
        System.out.println("secondRectangle has a area: " + secondRectangle.rectangleArea() + " and perimeter: " + secondRectangle.rectanglePerimeter());
        System.out.println("thirdRectangle has a area: " + thirdRectangle.rectangleArea() + " and perimeter: " + thirdRectangle.rectanglePerimeter());

        /*
        firstRectangle has a area: 50 and perimeter: 30
        secondRectangle has a area: 12 and perimeter: 16
        thirdRectangle has a area: 16 and perimeter: 16
         */

    }
}
