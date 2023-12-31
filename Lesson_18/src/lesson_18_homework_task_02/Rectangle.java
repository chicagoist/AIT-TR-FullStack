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

  public void setLength(int length) {
    this.length = length;
  }

  public int getWidth() {
    return this.width;
  }

  public void setWidth(int width) {
    this.width = width;
  }

  public int getRectangleArea() {
    return getLength() * getWidth();
  }

  public int getRectanglePerimeter() {
    return (2 * (getLength() + getWidth()));
  }
}
