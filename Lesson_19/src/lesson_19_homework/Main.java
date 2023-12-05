package lesson_19_homework;

/*
Задача 1
Создать класс Temperature (температура), содержащий метод для перевода градусов
по фаренгейту в градусы цельсия ( celsius = 5*(farenheit - 32)/9). В классе Main
создать несколько обьектов класса Temperature (значение температуры по фаренгейту
должно задаваться через конструктор)
и вывести результат перевода на экран
 */
public class Main {

  public static void main(String[] args) {
    Temperature temperature1 = new Temperature(32);
    System.out.printf(
        "Fahrenheit = %.1f and Celsius = %.1f\n",
        temperature1.getFahrenheit(), temperature1.celsius());

    Temperature temperature2 = new Temperature(0);
    System.out.printf(
        "Fahrenheit = %.1f and Celsius = %.1f\n",
        temperature2.getFahrenheit(), temperature2.celsius());

    Temperature temperature3 = new Temperature(100);
    System.out.printf(
        "Fahrenheit = %.1f and Celsius = %.1f\n",
        temperature3.getFahrenheit(), temperature3.celsius());

    Temperature temperature4 = new Temperature(14);
    System.out.printf(
        "Fahrenheit = %.1f and Celsius = %.1f\n",
        temperature4.getFahrenheit(), temperature4.celsius());
  }
}
/* Выхлоп:

Fahrenheit = 32.0 and Celsius = 0.0
Fahrenheit = 0.0 and Celsius = -17.8
Fahrenheit = 100.0 and Celsius = 37.8
Fahrenheit = 14.0 and Celsius = -10.0

 */
