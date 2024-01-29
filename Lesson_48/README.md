**Задачи на урок:**

    Discussing homework
    Introduction to Algorithm Complexity Analysis
    Date Time API

**Working with Dates and Times**

The LocalDate class from the java.time package is designed for working with dates. The functionality of this class allows you to create dates and modify them by adding or subtracting the necessary number of days, months, or years.

**Key methods of LocalDate:**

    static LocalDate now(): returns an object representing the current date.
    static LocalDate of(int year, int month, int day): returns an object representing a date with a specified year, month, and day.
    int getYear(): returns the year of the date.
    int getMonthValue(): returns the month.
    int getDayOfMonth(): returns the day of the month (value ranging from 1 to 31).
    int getDayOfYear(): returns the day of the year (value ranging from 1 to 365).
    DayOfWeek getDayOfWeek(): returns the day of the week as a DayOfWeek enumeration value.
    LocalDate plusDays(int n): adds a certain number of days to the date.
    LocalDate plusWeeks(int n): adds a certain number of weeks to the date.
    LocalDate plusMonths(int n): adds a certain number of months to the date.
    LocalDate plusYears(int n): adds a certain number of years to the date.
    LocalDate minusDays(int n): subtracts a certain number of days from the date.
    LocalDate minusMonths(int n): subtracts a certain number of months from the date.
    LocalDate minusWeeks(int n): subtracts a certain number of weeks from the date.
    LocalDate minusYears(int n): subtracts a certain number of years from the date.

**Работа с датами и временем**

Класс `LocalDate` из пакета `java.time` предназначен для работы с датами. Функционал этого класса позволяет создавать даты и изменять их, добавляя и отнимая необходимое количество дней/месяцев/лет.

**Основные методы** `LocalDate`:

`static LocalDate now()`: возвращает объект, который представляет текущую дату

`static LocalDate of(int year, int month, int day)`: возвращает объект, который представляет дату с определенными годом, месяцем и днем

`int getYear()`: возвращает год даты

`int getMonthValue()`: возвращает месяц

`int getDayOfMonth()`: возвращает день месяца (значение от 1 до 31)

`int getDayOfYear()`: возвращает номер дня года (значение от 1 до 365)

`DayOfWeek getDayOfWeek()`: возвращает день недели в виде значения перечисления `DayOfWeek`

`LocalDate plusDays(int n)`: добавляет к дате некоторое количество дней

`LocalDate plusWeeks(int n)`: добавляет к дате некоторое количество недель

`LocalDate plusMonths(int n)`: добавляет к дате некоторое количество месяцев

`LocalDate plusYears(int n)`: добавляет к дате некоторое количество лет

`LocalDate minusDays(int n)`: отнимает от даты некоторое количество дней

`LocalDate minusMonths(int n)`: отнимает от даты некоторое количество месяцев

`LocalDate minusWeeks(int n)`: отнимает от даты некоторое количество недель

`LocalDate minusYears(int n)`: отнимает от даты некоторое количество лет

**Asymptotic Analysis** ( _перевод см.ниже_)

When we talk about measuring the complexity of algorithms, we imply analyzing the time required to process a very large set of data. This kind of analysis is called asymptotic. How much time will it take to process an array of ten elements? Thousands? Ten million? If an algorithm processes a thousand elements in five milliseconds, what will happen if we feed it a million? Will it run for five minutes or five years? Isn't it better to clarify this before the client?

**The devil is in the details!**

****_Order of Growth_****

The order of growth describes how the complexity of an algorithm increases as the size of the input data grows. It's most often represented using Big O notation (from German "Ordnung" - order): 

`O(f(x))`, 

where `f(x)` is a formula expressing the algorithm's complexity. The formula may contain the variable n, representing the size of the input data. Below is a list of the most commonly encountered orders of growth, but it's by no means exhaustive.

**Constant** - O(1) An O(1) growth order means that the computational complexity of the algorithm doesn't depend on the size of the input data. It's important to note, however, that the one in the formula doesn't necessarily mean the algorithm executes in just one operation or requires very little time. It could take a microsecond or a year. What's significant is that this time doesn't depend on the input data.

**Linear** - O(n) An O(n) growth order means that the algorithm's complexity grows linearly with the increase in the input array's size. If a linear algorithm processes one element in five milliseconds, we can expect it to process a thousand elements in five seconds.

Such algorithms are easy to identify by the presence of a loop for each element in the input array.

**Logarithmic** - O(log n) An O(log n) growth order means that the algorithm's execution time grows logarithmically with the increase in the input array's size.

**Quadratic** - O(n^2) The runtime of an algorithm with an O(n^2) growth order depends on the square of the input array's size. Even though this situation is sometimes unavoidable, quadratic complexity is a reason to reconsider the algorithms or data structures being used.

**Асимптотический анализ**

Когда мы говорим об измерении сложности алгоритмов, мы подразумеваем анализ времени, которое потребуется для обработки очень большого набора данных. Такой анализ называют асимптотическим. Сколько времени потребуется на обработку массива из десяти элементов? Тысячи? Десяти миллионов? Если алгоритм обрабатывает тысячу элементов за пять миллисекунд, что случится, если мы передадим в него миллион? Будет ли он выполняться пять минут или пять лет? Не стоит ли выяснить это раньше заказчика?

**_Все решают мелочи!_**

**Порядок роста**

Порядок роста описывает то, как сложность алгоритма растет с увеличением размера входных данных. Чаще всего он представлен в виде O-нотации (от нем. «Ordnung» — порядок): 

`O(f(x))`, 

где `f(x)` — формула, выражающая сложность алгоритма. В формуле может присутствовать переменная n, представляющая размер входных данных. Ниже приводится список наиболее часто встречающихся порядков роста, но он ни в коем случае не полный.

**Константный** — O(1)

Порядок роста O(1) означает, что вычислительная сложность алгоритма не зависит от размера входных данных. Следует помнить, однако, что единица в формуле не значит, что алгоритм выполняется за одну операцию или требует очень мало времени. Он может потребовать и микросекунду, и год. Важно то, что это время не зависит от входных данных.

**Линейный** — O(n)

Порядок роста O(n) означает, что сложность алгоритма линейно растет с увеличением входного массива. Если линейный алгоритм обрабатывает один элемент пять миллисекунд, то мы можем ожидать, что тысячу элементов он обработает за пять секунд.

Такие алгоритмы легко узнать по наличию цикла по каждому элементу входного массива.

**Логарифмический** — O(log n)

Порядок роста O(log n) означает, что время выполнения алгоритма растет логарифмически с увеличением размера входного массива.

**Квадратичный** — O(n^2)

Время работы алгоритма с порядком роста O(n^2) зависит от квадрата размера входного массива. Несмотря на то, что такой ситуации иногда не избежать, квадратичная сложность — повод пересмотреть используемые алгоритмы или структуры данных.

    Получить и вывести на экран:
    -текущую дату
    -текущий год, месяц и день
    Создать дату , например день рождения и вывести на экран
    Создать две даты и проверить на равенство
    Получить и вывести на экран текущее время
    текущее время + 3 часа
    Создать дату на неделю позже сегодняшней
    Создать даты tomorrow и yesterday и проверить находятся ли они до или после сегодняшней

```java
code/complexity/src/Main.java

public class Main {
/*
ВВедение в анализ сложности алгоритмов.

     Алгоритм - это последовательность шагов, представляющая собой исключительно вычисление и не учитывающая особенности
     реализации "компьютерного железа", на котором она работает
     Анализ сложности дает возможность узнать как быстро будет работать программа когда она совершает вычисления
     на разных обьемах входных данных.
     */

    public int findMaxElt( int[]ints, int n){
        int max = ints[0];// 2 действия

        // 2 действия до запуска цикла - присвоение начального значения и проверка условия окончания цикла
        for( int i = 0; i < n; i++){
            if(ints[i] > max){
                max = ints[i];
            }
        }
        return max;
    }

    // f(n) = 4 + 2n - необходимое алгоритму кол-во инструкций для цикла for  с пустым  телом
    // 1,2,3,4
    // 4,3,2,1
    // В теории алгоритмов рассматриваются наихудшие сценарии, т.е. у нас это массив, упорядоченный по возрастанию и
    // макс.значение переписываеися для каждой итерации
    // f(n) = 4 + 2n +4n = 4 +6n

    // когда n  сильно вырастает, константу можно не учитывать, они не важны и отбрасываются
    // f(n) = 6n
    // f(n) = n;

    /*
    f(n) ´= 9n +24 ->   f(n) = n
    f(n) = 234*1  ->    f(n) = 1
    f(n) = n^2 + 3n +368  -> f(n) =  n^2
    f(n) = n^3 + 2000n + 300 -> f(n)= n^3

    Big O

    O(1) - алгоритм с константным временем и его сложность равна 1
    O(n) - сложность алгоритма О(n)
    O(n^2) - сложность алгоритма n ^2
    O( log n) -  логарифмическая сложность

    2^x = 1024
    2^10 = 1024
    логарифм 1024 - это та степень, в которую нужно возвести 2 чтобы получить 1024
    log(1024) = 10

    log(64) = 6
    2^6 = 64

    2^x = 4


    0   n
    1  n/2 2^1
    2  n/4  2^2
    3  n/8  2^3
    i  n/2^i
     */
}
```

```java
code/date_time/src/OurDateTime.java

import java.time.*;
import java.util.Set;

public class OurDateTime {

    /*
    Date/Time API

    начиная с Java 8  появились новые классы для работы с датой и временем.
    Существовавшие до этого классы имели ряд недостатков:
    1. Не были потокобезопасными
    2. Плохой дизайн и работа методов
    3. Отсутствовал учет временных зон

    Основные  классы для работы с датой и временем сейчас:

    1.LocalDate
    2.LocalTime
    3.LocalDateTime
    4.ZonedDateTime
    5.Period
    6.Duration

    LocalTime
     */

    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now(); //  текущее время
        System.out.println("Time now is " + localTime);

        // метод of() - создание обьекта LocalTime
        LocalTime localTime1 = LocalTime.of(15,30,35);
        System.out.println(localTime1);

        // получить часы
        System.out.println("hour: " +localTime1.getHour());
        System.out.println("minutes: " +localTime1.getMinute());

        LocalTime ourLocalTime = LocalTime.of(19,40,20);
        System.out.println("add hours:" + ourLocalTime.plusHours(2));
        System.out.println("add minutes:" + ourLocalTime.plusMinutes(10));
        System.out.println("add seconds:" + ourLocalTime.plusSeconds(20));

        // методы isBefore() and isAfter()- проверяют будет ли время на котором они вызываются позже
        // или раньше времени с которым оно сравнивается. Возвращает true/false

        LocalTime checkTime = LocalTime.of(13,15);
        System.out.println(checkTime.isBefore(LocalTime.now()));
        System.out.println(checkTime.isAfter(LocalTime.now()));

        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MIDNIGHT);
        System.out.println(LocalTime.NOON);

        // LocalDate - дата без указания временной зоны в формате год-месяц-день ( year-month-day)
        LocalDate now = LocalDate.now();
        System.out.println(now);

        LocalDate localDate = LocalDate.of(2022,1,30);
        System.out.println(localDate);

        System.out.println("Is 2024 a leap year? " + now.isLeapYear()); // проверяет високосный год
        System.out.println("Is 2022 a leap year? " + localDate.isLeapYear()); // проверяет високосный год

        // отнимать /прибавлять дни, недели, месяцы
        LocalDate yesterday = now.minusDays(1);
        System.out.println("yesterday was " + yesterday);

        System.out.println(now.getDayOfWeek());
        System.out.println(now.getEra());
        System.out.println(now.lengthOfMonth());


        // LocalDateTime -  сочетание даты и времени
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(2024,1,29,12,46);
        System.out.println(localDateTime1);

        // ZonedDateTime -  время/ дата с учетом временной зоны
        Set<String> availableZoneID = ZoneId.getAvailableZoneIds();
        System.out.println(availableZoneID);

        LocalDateTime nowDateTime = LocalDateTime.now();
        ZoneId london = ZoneId.of("Europe/London");
      //  ZonedDateTime inLondon = ZonedDateTime.of(nowDateTime,london);
      //  System.out.println("Time in London is " + inLondon);

        ZonedDateTime inBerlin = ZonedDateTime.now();
        System.out.println(inBerlin);

        ZonedDateTime inLondon = ZonedDateTime.now(london);
        System.out.println(inLondon);


    }
}
```

```java
code/homework48/src/Homework.java

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Homework {

    /*
    Задача 1
Пусть есть класс Person с полями имя и возраст. Написать метод,
принимающий список Person и возвращающий мапу,
где возраст является ключом, а лист людей этого возраста значением
*/
public static void main(String[] args) {
Person person1 = new Person("Jack",16);
Person person2 = new Person("Bill",50);
Person person3 = new Person("Ann",16);
Person person4 = new Person("Mary",50);
Person person5 = new Person("Peter",30);
List<Person> persons = Arrays.asList(person1,person2,person3,person4,person5);

        System.out.println(getPersonsByAge(persons));

        getPersonsByAge(persons).forEach((k,v) -> System.out.println(k + "->" +
                                            v.stream().map(Person::getName).toList()));


        System.out.println("Total age of persons older than 18 is " + countTotalAge(persons));
        System.out.println(printLegalAgeNames(persons));

        System.out.println(countWords("aaaaaaa cccc ab bbbbb a ff aaa","a"));
        System.out.println(countWords("aaaaaaa cccc ab bbbbb a ff aaa","aaa"));
        System.out.println(countWords("aaaaaaa cccc ab bbbbb a ff aaa","aaaaa"));
    }

    public static Map<Integer, List<Person>> getPersonsByAge(List<Person>persons){
        return persons
                .stream()
                .collect(Collectors.groupingBy(Person :: getAge));


    }

    /*
    Задача 2
Есть тот же класс Person с полями String name, int age.

Написать метод,принимающий список Person и возвращающий суммарный возраст тех, кто старше 18 лет
Написать метод,принимающий список Person и возвращающий имена тех, кто старше 18 лет в виде такой строки:
"At the moment John and Ann and Bill are of legal age "
( имена и текст могут быть любыми, по вашему выбору, структура предложения должна сохраняться)
*/

    public static int countTotalAge( List<Person> persons){
        return persons
                .stream()
                .filter(p -> p.getAge() > 18)
                .map(Person::getAge)
                .reduce(0,Integer :: sum);
    }


    public static int countTotalAge2( List<Person> persons){
        return persons
                .stream()
                .filter(p -> p.getAge() > 18)
                .mapToInt(Person::getAge)
                .sum();
    }

    public static String printLegalAgeNames( List<Person> persons){
        return persons
                .stream()
                .filter(p -> p.getAge() > 18)
                .map(Person :: getName)
                .collect(Collectors.joining(" and "," At the moment "," are of legal age."));
    }

    /*
    Задача 3
Написать метод, принимающий в качестве параметров две строки.
Первая строка состоит из слов, разделенных пробелом.
Метод возвращает количество слов первой строки, начинающихся со второй строки
Пример : Первая строка "aaaaaaa cccc ab bbbbb a ff aaa"
Если вторая строка а, то ответ 4
Если вторая строка ааа, ответ 2
Если вторая строка aaaa, ответ 1
*/

    public static long countWords(String sentence, String pattern){
        return Stream.of(sentence.split(" "))
                .filter(w ->w.startsWith(pattern))
                .count();
    }
}
```

```java
code/homework48/src/Person.java

public class Person {
private String name;
private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
```
