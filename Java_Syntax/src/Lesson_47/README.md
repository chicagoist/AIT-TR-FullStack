**Задачи на урок:**

    Discussing homework
    Stream API

#### Streams (Stream) in Java

A stream is a way to work with data without modifying its source. Just like in the real world, you can't turn back or traverse a stream again.

Streams are described in the java.util.stream package, with the full class name being java.util.stream.Stream.

[Stream Class Documentation](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/stream/Stream.html)

**Creating Streams**

##### Empty Stream

```java
Stream<String> streamEmpty = Stream.empty();
```

This can be useful where you don't want to pass null and trigger a NullPointerException, for example:

```java
public Stream<String> streamOf(List<String> list) {
if (list == null || list.isEmpty()) {
return Stream.empty();
}
return list.stream();
}
```

#### Stream from a Collection

All collections (Collection and its descendants) can create a stream from their existing data using the .stream() method:

```java
Collection<String> collection = Arrays.asList("a", "b", "c");
Stream<String> streamOfCollection = collection.stream();
```

#### Stream from an Array

You can create a stream from listed elements in the arguments like this:

```java
Stream<String> stream = Stream.of("a", "b", "c");
```

Or you can use the `Arrays.stream` method:

```java
String[] arr = {"a", "b", "c"};
Stream<String> streamOfArrayFull = Arrays.stream(arr);
Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
```

#### Primitive Data Type Streams

For streams containing `int`, `long`, `and` `double`, there are corresponding classes: `IntStream`, `LongStream`, and `DoubleStream`, respectively.

#### Working with Streams

Working with streams typically follows these steps:

    Creation from a data source.
    Processing using intermediate operations.
    Termination with a terminal operation.

_**Intermediate**_ operations (also called "**_lazy_**" operations) process incoming elements and return a stream. There can be multiple intermediate operations in a processing chain.

**_Terminal_** operations (also called "eager" operations) process elements and terminate the stream. There can be only one terminal operation in a processing chain.

**Intermediate Operations**

The general idea of intermediate operations "in a chain" should already be familiar to you. This is how working with streams is structured.

    filter(Predicate predicate) filters the stream by passing only elements that satisfy the condition.

    Predicate is a built-in functional interface, something that returns true or false, such as a lambda function.

    map(Function mapper) allows you to create a function to transform each element into something else.

    The Function<T,R> functional interface represents a function that takes an object of type T and returns an object of type R.

    limit(long maxSize) limits the stream to a maximum number of elements.

    skip(long n) skips the first n elements.

    sorted() or sorted(Comparator comparator) sorts the stream.

    distinct() returns only unique elements.

#### Terminal Operations

    forEach(Consumer action) applies an action to each element.

    Consumer is a functional interface describing an action on each element.

    count() returns the number of elements in the stream.

    collect(Collector collector) collects the elements into a list, set, or another collection, or joins them into a string.

    findFirst() retrieves the first element of the stream.

    allMatch(Predicate predicate) returns true if all elements in the stream satisfy the condition.

    anyMatch(Predicate predicate) returns true if at least one element in the stream satisfies the condition.

    noneMatch(Predicate predicate) returns true if no element in the stream satisfies the condition.

#### Collectors

[documetation](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/stream/Collectors.html)

Some collectors are already defined in the Collectors class (documentation).

    toList() collects elements into a List.

    toSet() collects elements into a set.

    counting() counts the number of elements.

    joining() joins elements into one string.
        joining(CharSequence delimiter)
        joining(CharSequence delimiter, CharSequence prefix, CharSequence suffix)

#### Example

Let's take the numbers 50, 60, 70, 80, 90, 100, 110, 120.

Filter out those less than 90.

Add 10 to each of the filtered numbers.

Print the first three resulting numbers.

#### Without streams:

```java
int[] arr = {50, 60, 70, 80, 90, 100, 110, 120};
int count = 0;
for (int x : arr) {
if (x >= 90) {
continue;
}
x += 10;
count++;
if (count > 3) {
break;
}
System.out.println(x);
}
```

#### With streams (with line breaks for clarity):

```java
int[] arr = {50, 60, 70, 80, 90, 100, 110, 120};
Arrays.stream(arr)
.filter(x -> x < 90)
.map(x -> x + 10)
.limit(3)
.forEach(System.out::println);
```

##### With streams, but without line breaks:

```java
IntStream.of(50, 60, 70, 80, 90, 100, 110, 120)
.filter(x -> x < 90)
.map(x -> x + 10)
.limit(3)
.forEach(System.out::print);
```

#### Потоки (Stream) в Java

[Stream Class документация (EN)](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/stream/Stream.html)

Поток - способ работать с данными, не меняя их источник. Поток, как и в реальном мире, не возможно повернуть назад или
обойти повторно.

Потоки описаны в пакете `javajava.util.stream`, полное имя класса -
`javajava.util.stream.Stream.`

###Класс Stream
####Создание потоков
#####Пустой поток

```java
Stream<String> streamEmpty = Stream.empty();
```

Может пригодиться нам там, где мы не хотим передавать `null` и вызывать `NullPointerException`, например:

```java
public Stream<String> streamOf(List<String> list) {
if (list == null || list.isEmpty()) {
return Stream.empty();
}
return list.stream();
}
```

####Поток на основе коллекции

Все коллекции (Collection и его наследники) могут создать поток на основе имеющихся данных при помощи метода .stream():

```java
Collection<String> collection = Arrays.asList("a", "b", "c");
Stream<String> streamOfCollection = collection.stream();
```

#### Поток на основе массива

Поток модно создавать как на основе перечисленных в аргументах данных

```java
Stream<String> stream = Stream.of("a", "b", "c");
```

#### Так и с использованием метода `Arrays.stream`:

```java
String[] arr = {"a", "b", "c"};
Stream<String> streamOfArrayFull = Arrays.stream(arr);
Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
```

#### Потоки объектов примитивных типов

Для потоков, содержащих в себе `int`, `long` и `double`, существуют классы `IntStream`, `LongStream` и `DoubleStream`
соответственно.

###Работа с потоками
####Работа с потоками обычно выглядит следующим образом:

    Создание из источника данных
    Обработка при помощи промежуточных (intermediate) операторов.
    Вызов терминального (terminal) оператора.

Промежуточные операторы (ещё называют "_lazy_" - ленивые) обрабатывают поступающие элементы и возвращают стрим. Промежуточных операторов в цепочке обработки элементов может быть много.

_Терминальные_ (ещё называют "_eager_" - жаждущие) — обрабатывают элементы и завершают работу стрима. Терминальный оператор в цепочке может быть только один.

####Промежуточные операторы

Общая идея промежуточных операторов "в цепочке" вам уже слегка знакома. Именно так может быть устроена работа со строками.

    filter(Predicate predicate) фильтрует стрим, пропуская только те элементы, что проходят по условию

    Predicate - встроенный функциональный интерфейс. "Что-то", возвращающее true или false - например, лямбда-функция);

    map(Function mapper) даёт возможность создать функцию, с помощью которой мы будем превращать каждый элемент в какой-то другой

    Функциональный интерфейс Function<T,R> представляет функцию перехода от объекта типа T к объекту типа R.

    limit(long maxSize) ограничивает стрим по количеству элементов

    skip(long n) пропускает n элементов

    sorted() или sorted(Comparator comparator) сортирует стрим

    distinct() возвращает только уникальные элементы

####Терминальные операторы

    forEach(Consumer action)

    Consumer - "Потребитель" - функциональный интерфейс, описывающий действие с каждым элементом.

    count() возвращает количество элементов стрима

    collect(Collector collector) собирает итог в список, множество или другую коллекцию, объединяет в строку...

    findFirst() вытаскивает первый элемент стрима

    allMatch(Predicate predicate) возвращает true, если все элементы стрима удовлетворяют условию predicate

    anyMatch(Predicate predicate) возвращает true, если хотя бы один элемент стрима удовлетворяет условию predicate

    noneMatch(Predicate predicate) возвращает true, если ни один элемент стрима не удовлетворяет условию predicate

####Коллекторы

Некоторые коллекторы уже описаны в
классе `Collectors` ([документация](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/stream/Collectors.html))
.

    toList() собирает элементы в List
    toSet() cобирает элементы в множество
    counting() подсчитывает количество элементов
    joining() собирает элементы в одну строку
        joining(CharSequence delimiter)
        joining(CharSequence delimiter, CharSequence prefix, CharSequence suffix)

####Пример

Возьмём числа 50, 60, 70, 80, 90, 100, 110, 120.
Отберём те из них, которые меньше 90.
Добавим к каждому отобранному по 10. Распечатаем первые три получившихся числа.

####Без потоков:

```java
int[] arr = {50, 60, 70, 80, 90, 100, 110, 120};
int count = 0;
for (int x : arr) {
if (x >= 90) {
continue;
}
x += 10;
count++;
if (count > 3) {
break;
}
System.out.println(x);
}
```

####С потоками (и красивыми переносами для большей понятности):

```java
int[] arr = {50, 60, 70, 80, 90, 100, 110, 120};
Arrays.stream(arr)
.filter(x -> x < 90)
.map(x -> x + 10)
.limit(3)
.forEach(System.out::println);
```

####С потоками, но без красивых переносов:

```java
IntStream.of(50, 60, 70, 80, 90, 100, 110, 120).filter(x -> x < 90).map(x -> x + 10).limit(3)
.forEach(System.out::print);
```

```java
public class Address {
private final String street;
private final int houseNumber;

    public Address(String street, int houseNumber) {
        this.street = street;
        this.houseNumber = houseNumber;
    }

    public String getStreet() {
        return street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", houseNumber=" + houseNumber +
                '}';
    }
}
```

`code/homework47/src/Homework.java`

```java
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toSet;

public class Homework {
//Написать метод, принимающий лист имен, в котором некоторые имена повторяются
// и печатающий имена из листа без печати повторений.
// При решении использовать Stream API
public static void main(String[] args) {
List<String> list = List.of("John","John","Jack","Jack");
withoutDuplicates(list);

        Address address1 = new Address("Street1",1);
        Address address2 = new Address("Street2",2);
        Address address3 = new Address("Street3",3);
        Address address4 = new Address("Street4",4);

        Person person1 = new Person("Person1",16,address1);
        Person person2 = new Person("Person2",26,address2);
        Person person3 = new Person("Person3",10,address3);
        Person person4 = new Person("Person4",116,address4);

        List<Person>persons = List.of(person1,person2,person3,person4);
        addressesPersonsMore17(persons);
    }

    public static void withoutDuplicates(List<String> names){
        names.stream().distinct().forEach(System.out :: println);
    }

    public static List<String> withoutDuplicatesList(List<String> names){
        return names.stream().distinct().collect(Collectors.toList());
    }

    public static List<String> withoutDuplicatesSet(List<String> names){
        return names.stream().collect(
                Collectors.collectingAndThen(toSet(), ArrayList ::new));
    }



    /*
    Есть класс Address с полями String street и int houseNumber и
    класс Person с полями String name, int age, Address address.
    Используя Stream API написать метод, принимающий лист Person и печатающий адреса тех, кто старше 17 лет
     */

    public static void addressesPersonsMore17( List<Person> personList){
        personList.stream()
                .filter(p -> p.getAge() > 17)
                .map(Person::getAddress)
                .forEach(System.out :: println);

    }

    public static List<Address> addressesPersonsMore17List( List<Person> personList){
        return  personList.stream()
                .filter(p -> p.getAge() > 17)
                .map(Person::getAddress)
               // .forEach(System.out :: println);
                .collect(Collectors.toList());

    }
}
```

`code/homework47/src/Person.java`

```java
public class Person {
private final String name;
private final int age;
private final Address address;


    public Person(String name, int age, Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }
}
```

`code/our_stream/src/Car.java`

```java
public class Car {
    private final String brand;
    private final int price;

    public Car(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }
}
```

`code/our_stream/src/Main.java`

```java
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
public static void main(String[] args) {
//flatMap
String[] strings = {"Hello","Java"};

        Arrays.stream(strings)
                .map(str -> str.split(""))
                .map(Arrays :: stream)
                .forEach(System.out :: println);


        Arrays.stream(strings)
                .map(str -> str.split(""))
                .flatMap(Arrays :: stream)
                .forEach(System.out :: print);

        // терминальные операторы
        /*
        count() -  возвращает кол-во элементов в потоке

        findFirst()/findAny() -  извлекает первый эл-т / случайный элт ( часто тоже первый)

         */
        System.out.println();
        List<String> list = Arrays.asList("one","two","three","four");

      Optional<String> first = list.stream().findFirst();
        System.out.println(first.get());

        Optional<String> any = list.stream().findAny();
        System.out.println(any.get());

        // allMatch, anyMatch, noneMatch

        /*
        allMatch(predicate) - true , если все элементы стрима удовлетворяют условию предикаты
        anyMatch(predicate) - true , если хотя бы один элемент стрима удовлетворяет условию предикаты
        noneMatch(predicate) - true , если ни один элемент стрима не удовлетворяет условию предикаты
         */
        List<String> names = Arrays.asList("Jack","John","Ann","Vladislav");

        boolean allElements = names.stream().allMatch(s -> s.length() > 2);
        System.out.println(allElements);

        boolean anyElement = names.stream().anyMatch(s -> s.length() > 7);
        System.out.println(anyElement);

        boolean noneElement = names.stream().noneMatch(s -> s.equals("Tim"));
        noneElement = names.stream().noneMatch(s -> s.equals("Ann"));
        System.out.println(noneElement);

        // min()  и max() -  возвращают мин и макс значение
        // Optional<T> min ( T comparator)

        List<Integer> ints = Arrays.asList(3,4,1,34,68,19);

       Optional<Integer> minElt =  ints.stream().min(Integer:: compare);
        System.out.println(minElt.get());

        Optional<Integer> maxElt =  ints.stream().max(Integer:: compare);
        System.out.println(maxElt.get());

        // reduce()

      Optional<Integer> res =  Stream.of(1,2,3,4,5).reduce((a,b)-> a * b);
        System.out.println(res.get());
        // e1*e2*e3*e4*e5

      Optional<String> stringResult = Stream.of("Hello","Java","!!")
              .reduce((str1,str2)-> str1 +" " +str2);
        System.out.println(stringResult.get());

      int result = Stream.of(1,2,3,4,5).reduce(2,(a,b)->a * b);
        System.out.println(result);

        //метод collect(collector)
        // Collector<T,A,R> collector
        /*
         несколько методов класса Collectors:
        toList()
        toSet()
        toMap()
         */

        List<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("Mercedes");
        cars.add("BMW");
        cars.add("Opel");
        cars.add("Ford");
        cars.add("Ford");

        List<String> carsFiltered =cars.stream()
                .filter(car -> car.length() > 3)
                .collect(Collectors.toList());

        System.out.println(carsFiltered);


        Set<String> carsSet =cars.stream()
                .filter(car -> car.length() > 3)
                .collect(Collectors.toSet());

        System.out.println(carsSet);

        Car car1 = new Car("BMW",150000);
        Car car2 = new Car("Mercedes",200000);
        Car car3 = new Car("Opel",40000);

        List<Car> carList = Arrays.asList(car1,car2,car3);

        Map<String,Integer> carMap = carList.stream()
                .collect(Collectors.toMap(Car::getBrand,Car::getPrice));

        System.out.println(carMap);
        carMap.forEach((key,value) -> System.out.println("key: " + key + " ,value:" + value));

        ArrayList<Car> resultCars = carList.stream().collect(Collectors.toCollection(ArrayList :: new));

        System.out.println("grouping by");
        List<String> namesList = Arrays.asList("John","Bill","Tim","Jack","Peter","Benji");
        System.out.println(namesByLength(namesList));

        System.out.println("\npartitioning by");
        System.out.println(partitioningList(namesList));

        System.out.println("\njoining");
        System.out.println(convertToString(namesList));
    }
    // groupingBy collector -  используется для группировки обьектов по заданному признаку и сохранения
    // результата в мапе :
    // Написать метод, группирующий элементы листа строк по длине строки и сохраняющий рез-т в сетах. Метод вернет
    // мапу

    public static Map<Integer,Set<String>> namesByLength( List<String>list){
        return list.stream()
                .collect(Collectors.groupingBy(String :: length, Collectors.toSet()));
    }

    /*
    partitioningBy - особый случай groupingBy , принимающий предикату и собирающий стрим в мапу, у которой
    ключами будут true false, а в качестве значений  - коллекции элементов.
    Ключ true -  элементы, удовлетворяющие условию
    false -  не удовл.
    Пример: написать метод, разделяющий элементы листа стрингов по длине строки  > 4  и возвращающий мапу
    с ключами true false и листами соответствующих элементов

     */
    public static Map<Boolean,List<String>> partitioningList( List<String>strings){
        return strings.stream()
                .collect(Collectors.partitioningBy(s -> s.length() > 4));
    }

    /*
    joining()
    обьединить имена из листа в строку такого вида Students: name1,name2,name3 study Java

     */
    public static String convertToString( List<String>strings){
        return strings
                .stream()
                .collect(Collectors.joining(", ","Students: "," study Java"));
    }

}
```

`code/our_stream/src/Practice.java`

```java
public class Practice {

    /*
    написать метод, проверяющий является ли строка числом
    "123456" -> true
    "ab123" -> false
    Character.isDigit()  allMatch()
     */
    public static void main(String[] args) {
        System.out.println(isStringDigit("123457"));
        System.out.println(isStringDigit("a123457"));
    }

    public static boolean isStringDigit(String str){
        return str.chars().allMatch(Character :: isDigit);
    }


}
```
