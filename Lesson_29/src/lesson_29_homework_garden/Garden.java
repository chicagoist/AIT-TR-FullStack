package lesson_29_homework_garden;

/*
Алгоритм создания Java-приложения для проекта "Садовод-любитель":

1. **Создание классов:**
   - Создать родительский класс `Plant` с общими характеристиками: `name`,
   `height`, `age`.
   - Создать дочерние классы `Flower` и `Tree`, которые будут наследовать
   класс `Plant`.

2. **Методы и абстрактность:**
   - Решить, какие методы будут общими для всех растений (`doSpring()`,
   `doSummer()`, `doAutumn()`, `doWinter()`). Возможно, `doSpring()` и
   `doSummer()` можно реализовать в родительском классе, а `doAutumn()` и
   `doWinter()` объявить абстрактными.

3. **Реализация метода `growPlants()`:**
   - В классе `Garden` создать метод `growPlants()`, который будет отражать
   процесс роста растений в течение нескольких лет.
   - В методе использовать цикл или несколько циклов для отслеживания сезонов
    (`Spring`, `Summer`, `Autumn`, `Winter`) и вызывать соответствующие
    методы для растений в каждом сезоне.
   - Для каждого растения выводить информацию о его поведении в текущем
   сезоне: например, рост, цветение, отсечка.
   - Вывести информацию о высоте и возрасте растений в конце заданного
   периода (2 года).

4. **Тестирование:**
   - Проверить корректность работы программы, убедиться, что процесс роста
   растений отражен правильно для всех сезонов и типов растений.

Важно следить за тем, чтобы абстрактные методы были реализованы в
соответствующих классах-наследниках и общие методы содержали общую логику для
 всех растений.
 */


import java.util.Scanner;

public class Garden {
    public static void main(String[] args) {

        // Передаём аргументы в конструктор: название, дрлину ростка
        Plant flowerPupil = new Flower("Pupil", 10);
        growPlants(flowerPupil);

        // Передаём аргументы в конструктор: название, дрлину ростка
        Plant treeOak = new Tree("Oak", 10);
        growPlants(treeOak);
    }

    public static void growPlants(Plant obj) {

        String[] arrayOfSeason = {"Spring", "Summer", "Autumn", "Winter" };
        Scanner myScanner = new Scanner(System.in);


        System.out.print("Enter the number of years to forecast the growth of" +
                " this" +
                " plants: ");
        final int years = myScanner.nextInt();
        obj.setAge(years);

        for(int i = 0; i < years; i++) {
            for(String season : arrayOfSeason) {
                if(season.equalsIgnoreCase("Spring")) {
                    obj.doSpring();
                } else if(season.equalsIgnoreCase("Summer")) {
                    obj.doSummer();
                } else if(season.equalsIgnoreCase("Autumn")) {
                    obj.doAutumn();
                } else if(season.equalsIgnoreCase("Winter")) {
                    obj.doWinter();
                }
            }
        }
        System.out.println(obj.getName() + " has height: " + obj.getHeight() + " and " +
                "is " + obj.getAge() + " years old");
    }
}

/*OUTPUT
Enter the number of years to forecast the growth of this plants: 2
Pupil has height: 0 and is 2 years old
Enter the number of years to forecast the growth of this plants: 2
Oak has height: 890 and is 2 years old
 */