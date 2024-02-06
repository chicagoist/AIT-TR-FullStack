**Lambda Expressions**

Among the innovations introduced into the Java language with the release of JDK 8, lambda expressions stand out. A lambda represents a set of instructions that can be assigned to a variable and then invoked multiple times in various parts of the program.

The core of a lambda expression is the lambda operator, which is represented by the arrow "->". This operator separates the lambda expression into two parts: the left part contains the list of parameters for the expression, and the right part actually represents the body of the lambda expression, where all the actions are performed.

A lambda expression doesn't execute by itself; instead, it forms an implementation of a method defined in a functional interface. It is important to note that the functional interface should contain only a single method without an implementation.

**Method Reference**

Starting from JDK 8 in Java, you can pass a reference to another method as a parameter to a method. In principle, this approach is similar to passing lambda expressions as parameters.

A method reference is passed in the form of class_name::static_method_name (if the method is static) or object_class::method_name (if the method is non-static).

Built-in Functional Interfaces
In JDK 8, along with the functionality of lambda expressions, a number of built-in functional interfaces were also added, which we can use in various situations and in different APIs. In particular, in the Stream API, which is an application interface for working with data, the main interfaces include:

    Predicate
    Consumer
    Function<T, R>
    Supplier
    UnaryOperator
    BinaryOperator

**Лямбда выражения**

Среди новшеств, которые были привнесены в язык Java с выходом JDK 8, особняком стоят лямбда-выражения. Лямбда представляет набор инструкций, которые можно выделить в отдельную переменную и затем многократно вызвать в различных местах программы.

Основу лямбда-выражения составляет лямбда-оператор, который представляет стрелку ->. Этот оператор разделяет лямбда-выражение на две части: левая часть содержит список параметров выражения, а правая собственно представляет тело лямбда-выражения, где выполняются все действия.

Лямбда-выражение не выполняется само по себе, а образует реализацию метода, определенного в функциональном интерфейсе. При этом важно, что функциональный интерфейс должен содержать только один единственный метод без реализации.

**Ссылка на метод**

Начиная с JDK 8 в Java можно в качестве параметра в метод передавать ссылку на другой метод. В принципе данный способ аналогичен передаче в метод лямбда-выражения.

Ссылка на метод передается в виде:

```text
имя_класса::имя_статического_метода (если
метод статический)

или

объект_класса::имя_метода (если метод нестатический).
```

**Встроенные функциональные интерфейсы**

В JDK 8 вместе с самой функциональностью лямбда-выражений также было добавлено некоторое количество встроенных функциональных интерфейсов, которые мы можем использовать в различных ситуациях и в различные API. В частности, в Stream API - прикладном интерфейсе для работы с данными. основные из этих интерфейсов:

```text
Predicate
Consumer
Function<T,R>
Supplier
UnaryOperator
BinaryOperator
```

```java
code/built_in_interfaces/src/Main.java

import java.util.function.*;

public class Main {
/*
Встроенные функциональные интерфейсы:

    Predicate<T> -  проверяет соблюдение некоторого условия. Если оно соблюдается,
    возвращает true
        boolean test(T t)
     */
    public static void main(String[] args) {
        Predicate<Integer> isNegative = a -> a < 0;
        System.out.println(isNegative.test(3));
        System.out.println(isNegative.test(-3));

        // BinaryOperator<T> принимает два обьекта типа T  что-то с ними делает и возвращает рез-т типа T
        // T apply( T o1, T o2)
        BinaryOperator<Integer> plus = (a,b) -> a +b;
        System.out.println(plus.apply(1,2));

        BiFunction<Integer,Integer,String> concate = (a,b) -> Integer.toString(a) + b;
        System.out.println(concate.apply(1,2));

        //UnaryOperator<T>  принимает обьект типа T  , совершает с ним какие-то действия и возвращает  в виде
        // обьекта того же типа  T apply(T o1)

        UnaryOperator<Integer> square = a -> a*a;
        System.out.println(square.apply(2));

        // Function<T,R> -  принимает тип T,  возвращает R
        Function<Integer,String> modify = i -> i +" years";
        System.out.println(modify.apply(50));

        /*
        Consumer<T>
        void accept( T o)
         */
        Consumer<String> consumer = System.out::println;
        consumer.accept("Hello");

        /*
        Supplier<T> -  ничего не принимает, но возвращает обьект типа Т
        T get()
         */
        Supplier<String> supplier = () -> " Hello !!!";
        System.out.println(supplier.get());

    }
}
```

```java
code/homework45/src/Homework.java

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.List;

public class Homework {

    /*
    Написать метод, принимающий имя файла и лист Person. Метод сохраняет в этот файл обьекты класса Person из листа
    ( класс Person имеет 2 поля name и age- см код занятия).
     */
    public static void main(String[] args) {
        Person person1 = new Person("Peter",40);
        Person person2 = new Person("John",45);
        Person person3 = new Person("Bill",67);

        List<Person>persons = Arrays.asList(person1,person2,person3);
        writePersonToFile("output.txt",persons);
    }

    public static void writePersonToFile( String fileName, List<Person> persons){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName,true));
            BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(System.out))) {

            for(Person person : persons) {
                bw.write("\"" + person.name + "\"" + "," + person.age);
                bw1.write("\"" + person.name + "\"" + "," + person.age);
                bw.newLine();
                bw1.newLine();
            }

        }catch (IOException e){}
            // in, out, err
    }
}
```

```java
code/homework45/src/Person.java

public class Person implements Comparable<Person>{
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int compareTo(Person person){
        return this.age - person.age;
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

```java
code/lambda/src/IsMoreInterface.java

public interface IsMoreInterface {
    boolean isMore(int num);
}
```

```java
code/lambda/src/Main.java

public class Main {
    public static void main(String[] args) {
        Operationable<Integer> operationable = (x,y)->(x+y);
        System.out.println(operationable.calculate(1,2));

        Operationable<String> stringOperationable = (x,y)->(x + y);
        System.out.println(stringOperationable.calculate("1","2"));

        // Лямбда как параметр метода. - Лямбда выражение можно передавать в качестве параметра  в метод

        int[] ints = {10,20,30,40,50};
        IsMoreInterface condition = n -> n > 20;
        System.out.println(condition.isMore(15));
        System.out.println(condition.isMore(25));

        System.out.println( sumIfCond(ints,condition));
        condition = n -> n < 30;
        System.out.println( sumIfCond(ints,condition));

    }
    public static int sumIfCond( int[] ints, IsMoreInterface lambdaExpression){
        int sum = 0;

        for( int element: ints){
            if(lambdaExpression.isMore(element)){
                sum += element;
            }
        }
        return sum;
    }
}
```

```java
code/lambda/src/Operationable.java

public interface Operationable<T> {
    T calculate(T i, T y);
}

code/method_reference/src/ExampleClass.java

public class ExampleClass {
  public   static boolean isEven( int n){
        return n % 2 == 0;
    }

    public static boolean isPositive( int n){
      return n > 0;
    }
}
```

```java
code/method_reference/src/ExampleClass2.java

public class ExampleClass2 {

    public  boolean isPositive( int n){
        return n > 0;
    }
}
```

```java
code/method_reference/src/ExampleInterface.java

public interface ExampleInterface {
    boolean isEqual( int i);
}
```

```java
code/method_reference/src/Main.java

public class Main {
   /*
    Method references ( ссылки на методы)

    1. Ссылки на статические методы
     ClassName :: methodName

    2. Ссылки  instance method references

    */
   public static void main(String[] args) {
       int[] ints = {-6,-2,1,3,4,6};
       ExampleInterface exampleInterface = ExampleClass::isEven;
     //  System.out.println(findSumCondition(ints,ExampleClass::isPositive));

     //  System.out.println(findSumCondition(ints,ExampleClass ::isEven));

       ExampleClass2 exampleClass2 = new ExampleClass2();
    //   System.out.println(findSumCondition(ints,exampleClass2::isPositive));

       // ссылки на конструктор
       PersonCreator personCreator = Person::new;
       Person person = personCreator.create("John");

       System.out.println(person.getName());
   }

    public static int findSumCondition(int[] ints, ExampleInterface example)
    {
        int sum = 0;

        for( int i : ints)
        {
            if(example.isEqual(i))
                sum += i;
        }
        return sum;

    }
}
```

```java
code/method_reference/src/Person.java

public class Person {
    private final String name;

    Person(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }
}
```

```java
code/method_reference/src/PersonCreator.java

public interface PersonCreator {
    Person create(String name);
}
```

```java
code/our_interfaces/src/Checkable.java

public interface Checkable {
    boolean check( String string);
}
```

```java
code/our_interfaces/src/Concatable.java

public interface Concatable {
  String  concat( int a, int b);
}
```

```java
code/our_interfaces/src/Main.java

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

        Checkable checkable = s -> s.length() == 3;
        System.out.println(checkable.check("abc"));
        System.out.println(checkable.check("abcd"));

        System.out.println("checkable even");
        checkable = s -> s.length() % 2 == 0;
        System.out.println(checkable.check("abc"));
        System.out.println(checkable.check("abcd"));

        Transformable transformable = String::toUpperCase;
        System.out.println(transformable.modify("abcDe"));

        Transformable transformable1 = s -> s.length() == 4 ? "****":s;
        System.out.println(transformable1.modify("ab"));
        System.out.println(transformable1.modify("abcd"));

        Printable printable = s -> System.out.println("!" + s + "!");
        printable.print("Hello");

        Producable producable = () -> "Hello World";
        System.out.println(producable.produce());

    }
}
```

```java
code/our_interfaces/src/Printable.java

public interface Printable {
    void print(String s);
}
```

```java
code/our_interfaces/src/Producable.java

public interface Producable {
    String produce();
}
```

```java
code/our_interfaces/src/Transformable.java

public interface Transformable {
    String modify( String string);
}
```

**HONE WORK**

```text
Переписать лямбда выражения из класса Main пакета
our_interfaces (см.код) с использованием стандартных
функциональных интерфейсов

```
