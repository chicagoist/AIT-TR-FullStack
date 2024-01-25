**Задачи на урок:**

    Discussing homework
    Stream API
    Class Optional

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

Or you can use the Arrays.stream method:

```java
String[] arr = {"a", "b", "c"};
Stream<String> streamOfArrayFull = Arrays.stream(arr);
Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
```

#### Primitive Data Type Streams

For streams containing int, long, and double, there are corresponding classes: IntStream, LongStream, and DoubleStream, respectively.

#### Working with Streams

Working with streams typically follows these steps:

    Creation from a data source.
    Processing using intermediate operations.
    Termination with a terminal operation.

Intermediate operations (also called "lazy" operations) process incoming elements and return a stream. There can be multiple intermediate operations in a processing chain.

Terminal operations (also called "eager" operations) process elements and terminate the stream. There can be only one terminal operation in a processing chain.
Intermediate Operations

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

Поток - способ работать с данными, не меняя их источник. Поток, как и в реальном мире, не возможно повернуть назад или обойти повторно.

Потоки описаны в пакете ```javajava.util.stream```, полное имя класса - 
```javajava.util.stream.Stream.```

###Класса Stream
####Создание потоков
#####Пустой поток

```java
Stream<String> streamEmpty = Stream.empty();
```

Может пригодиться нам там, где мы не хотим передавать ```null``` и вызывать ```NullPointerException```, например:

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

####Поток на основе массива

Поток модно создавать как на основе перечисленных в аргументах данных

```java
Stream<String> stream = Stream.of("a", "b", "c");
```
####Так и с использованием метода  ```Arrays.stream```:

```java
String[] arr = {"a", "b", "c"};
Stream<String> streamOfArrayFull = Arrays.stream(arr);
Stream<String> streamOfArrayPart = Arrays.stream(arr, 1, 3);
```

####Потоки объектов примитивных типов

Для потоков, содержащих в себе ```int```, ```long``` и ```double```, существуют классы ```IntStream```, ```LongStream``` и ```DoubleStream``` соответственно.

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

Некоторые коллекторы уже описаны в классе ```Collectors``` ([документация](https://docs.oracle.com/en/java/javase/20/docs/api/java.base/java/util/stream/Collectors.html)).

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



```code/main46/src/MergeMethodDemo.java```
```java
import java.util.HashMap;
import java.util.Map;

public class MergeMethodDemo {

    /*
     метод merge()

     Map hashMap = new HashMap()
     hashMap.merge(key,value, remappingFunction)

     параметры:
     key -  ключ, по которому нужно положить значение value
     value - значение связанное с ключом key
     remapping function - используется в случае, если ключ key уже существует

     Метод просто добавляет значение value  по ключу key   если такого ключа в мапе нет.
     Если есть, то с помощью remapping function определяется каким будет новое значение value
     */
    public static void main(String[] args) {
        Map<String,Integer> items = new HashMap<>();

        items.put("Desktop",1000);
        items.put("TVset",600);
        items.put("Mouse",30);

        System.out.println(items);

        items.merge("Phone",250,(oldValue,newValue)->oldValue + newValue);

        System.out.println(items);

        items.merge("Desktop",500, Integer::sum);
        System.out.println(items);


        Map<String,String> cities = new HashMap<>();
        cities.put("Berlin","Germany");
        cities.put("Paris","France");
        cities.put("London","England");

        System.out.println("Countries:");
        System.out.println(cities);

        cities.merge("London","GreatBritain",(oldValue,newValue)-> oldValue +"/" + newValue);
        cities.merge("Madrid","Spain",(oldValue,newValue)-> oldValue +"/" + newValue);

        System.out.println("Countries changed");
        System.out.println(cities);

        System.out.println("With forEach");
        cities.forEach((key,value) -> System.out.println("key: " + key +" value:" + value));


        Map<String,Integer> items1 = new HashMap<>();
        items1.put("Desktop",600);
        items1.put("Mouse",150);

        Map<String, Integer> items2 = new HashMap<>();
        items2.put("TVset",800);
        items2.put("Mouse",100);

        items2.forEach((key,value)-> items1.merge(key,value,(oldValue,newValue)->{

            if(oldValue < newValue)
                return oldValue;
            else
                return newValue;
        }));

        System.out.println("merged map");
        items1.forEach((key,value) -> System.out.println("key: " + key +" value:" + value));
    }
}
```
 
```code/our__interfaces/src/Checkable.java```
```java
public interface Checkable {
boolean check( String string);
}

code/our__interfaces/src/Concatable.java

public interface Concatable {
String  concat( int a, int b);
}

code/our__interfaces/src/Main.java

import java.util.function.*;

public class Main {
/*
Создать следующие интерфейсы:
Printable, содержащий метод void print(String s)
Producable, содержащий метод String produce()
Используя эти интерфейсы написать 2 лямбды, реализующие метод соответствующего интерфейса таким образом:

строка распечатывается в виде !строка!
возвращается строка "Hello World"
*/
public static void main(String[] args) {

        //  используя наши интерфейсы написать такие лямбды:
        // 1. конкатинировать  a и b   и получить ab
        // 2.  если длина строки 3 вернуть true
        // 3.  если длина строки четная вернуть true  иначе false
        // 4. вернуть строку в верхнем регистре
        // 5. если длина строки 4 вернуть 4 звездочки иначе вернуть строку без изменений

        Concatable concatable = (a,b) -> Integer.toString(a) + b;
        System.out.println(concatable.concat(1,3));

        BiFunction<Integer,Integer,String> biFunction = (a,b) -> Integer.toString(a) + b;
        System.out.println(biFunction.apply(1,3));

        Checkable checkable = s -> s.length() == 3;
        System.out.println(checkable.check("abc"));
        System.out.println(checkable.check("abcd"));

        Predicate<String> predicate = s -> s.length() == 3;
        predicate.test("abc");

        System.out.println("checkable even");
        checkable = s -> s.length() % 2 == 0;
        System.out.println(checkable.check("abc"));
        System.out.println(checkable.check("abcd"));
        predicate = s -> s.length() % 2 == 0;


        Transformable transformable = String::toUpperCase;
        System.out.println(transformable.modify("abcDe"));
        Function<String,String> function = String::toUpperCase;


        Transformable transformable1 = s -> s.length() == 4 ? "****":s;
        System.out.println(transformable1.modify("ab"));
        System.out.println(transformable1.modify("abcd"));
        UnaryOperator<String> unaryOperator = s -> s.length() == 4 ? "****":s;

        Printable printable = s -> System.out.println("!" + s + "!");
        printable.print("Hello");
        Consumer<String> consumer = s -> System.out.println("!" + s + "!");
        consumer.accept("abc");

        Producable producable = () -> "Hello World";
        System.out.println(producable.produce());
        Supplier<String> supplier = () -> "Hello World";
        System.out.println(supplier.get());

    }
}
```

```code/our__interfaces/src/Printable.java```
```java
public interface Printable {
void print(String s);
}
```

```code/our__interfaces/src/Producable.java```
```java
public interface Producable {
String produce();
}
```

```code/our__interfaces/src/Transformable.java```
```java
public interface Transformable {
String modify( String string);
}
```

```code/stream_api/src/Car.java```
```java
public class Car {

    private String brand;
    private int price;

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

```code/stream_api/src/Main.java```
```java
import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
public static void main(String[] args) {

        int[] ints = {10,20,30,40,50,60,70,80};
        int counter = 0;

        for( int i : ints){
            if( i < 31)
                continue;
            i = i * 2;
            counter++;
            if(counter > 4)
                break;
            System.out.println(i);
        }

        System.out.println("with stream");

        IntStream.of(10,20,30,40,50,60,70,80)
                .filter(i -> i >= 31)
                .map(i -> i*2)
                .limit(4)
                .forEach(System.out :: println);

        /*
        Stream API - это поток данных.
        Операторы в стримах бывают :
        промежуточные - после обработки данных они вернут стрим. Промежуточных операторов может быть несколько

        терминальные - после обработки элементов  завершают работу стрима. Терминальный  оператор может быть только один
        Обработка данных не начнется пока не будет вызван терминальный оператор

        Создание стримов:


         */
        Stream<String> empty = Stream.empty(); // пустой стрим

        Collection<String> collection = Arrays.asList("John","Jack","Bill"); // стрим коллекции
        collection.stream();

        String[] arr = {"John","Jack","Bill"};
        Arrays.stream(arr); // стрим массива

        "abcd".chars(); //  стрим строки
         String one = "one";
        Stream.of(one,"two"); //  с помощью статического метода of

        //  стримы примитивов
        IntStream intStream = IntStream.of(1,2,3);
        IntStream.range(1,3); // стрим целых чисел  в диапазоне от 1 до 3, 3 не включая
        IntStream.rangeClosed(1,3); // стрим целых чисел  в диапазоне от 1 до 3, 3  включая

        // стрим примитивов с помощью класса Random
        Random random = new Random();
        random.doubles();

        // метод ForEach  -перебор элементов, терминальный оператор
        Stream<String> names = Stream.of("Jack","John","Ann","Kate");
        names.forEach(System.out :: println);

        // промежуточные операторы
         /*
         filter() -  принимает условие( предикату)  и возвращает поток из элементов, удовлетворяющих этому условию

          */
        System.out.println("after filter");
        names = Stream.of("Jack","John","Ann","Kate");
        names.filter(n ->n.length() == 4).forEach(System.out::println);

        Stream<Car> carStream = Stream.of( new Car("Ford",50000),
                                                  new Car("Mercedes",100000),
                                                  new Car ("Bentley",500000));

        carStream.filter(car -> car.getPrice() < 150000)
                 .forEach(car -> System.out.println(car.getBrand()));


        // map() - маппинг, отображение - преобразует элементы потока map(Function mapper)

        carStream = Stream.of( new Car("Ford",50000),
                new Car("Mercedes",100000),
                new Car ("Bentley",500000));

        carStream.filter(car -> car.getPrice() < 150000)
                .map(Car::getBrand)
                .forEach(System.out :: println);

        carStream = Stream.of( new Car("Ford",50000),
                new Car("Mercedes",100000),
                new Car ("Bentley",500000));

        carStream.map(car ->"brand: " + car.getBrand() + "price: " + car.getPrice())
                 .forEach(System.out::println);

        // sorted() - сортировка
        System.out.println("sorting");

        List<String> cars = new ArrayList<>();
        cars.add("Mercedes");
        cars.add("Volvo");
        cars.add("Volvo");
        cars.add("Bentley");
        cars.add("Bentley");
        cars.add("Opel");
        cars.add("Opel");

        cars.stream()
                .filter(car -> car.length() > 4)
                .sorted()
                .forEach(System.out::println);


        System.out.println();
        // distinct() -  возвращает уникальные элементы
         cars.stream().distinct().forEach(System.out::println);

         // skip(long n) -  пропускает первые n  элементов
        // limit( long n) - возвращает поток в котором не более n первых элементов
        System.out.println("skip and limit");
        List<String> stringList = Arrays.asList("one","two","three","four","five");
        stringList.stream()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);

        // Терминальные операторы . Операции, возвращающие результат

        //count() - возвращает количество элементов в потоке
        System.out.println(
                stringList.stream()
                .filter(s -> s.length()>3)
                .count()
        );
    }
}
```

```code/stream_api/src/OurOptional.java```
```java
import java.util.Optional;

public class OurOptional {
/*
Класс  Optional  - предоставляет доп. возможности для обработки null


     */
    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent());

        // создание не пустого  обьекта
        String name = "John";
        Optional<String> optJohn = Optional.of(name);
        System.out.println(optJohn.isPresent());

        optJohn.ifPresent(str -> System.out.println(str.length()));

        // методы получения значения
        String nullName = null;
      //  nullName = "Jack";

        // orElse
        String kate = Optional.ofNullable(nullName).orElse("Kate");
        System.out.println(kate);
        // orElseGet
        String anotherName = Optional.ofNullable(nullName).orElseGet(()->"Kate");

        // get
        Optional<String> word = Optional.of("Java");
        String hello = word.get();


    }
}
```
####HOME WORK

**Задача 1**

Написать метод, принимающий лист имен, в котором некоторые имена повторяются и печатающий имена из листа без печати повторений. При решении использовать Stream API

**Задача 2**

Есть класс Address с полями String street и int houseNumber и класс Person с полями String name, int age, Address address. Используя Stream API написать метод, принимающий лист Person и печатающий адреса тех, кто старше 17 лет
