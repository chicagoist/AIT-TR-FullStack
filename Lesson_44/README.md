**Lambda Expressions**

Among the innovations introduced into the Java language with the release of JDK 8, lambda expressions stand out. A lambda represents a set of instructions that can be assigned to a variable and then invoked multiple times in various parts of the program.

The core of a lambda expression is the lambda operator, which is represented by the arrow "->". This operator separates the lambda expression into two parts: the left part contains the list of parameters for the expression, and the right part actually represents the body of the lambda expression, where all the actions are performed.

A lambda expression doesn't execute by itself; instead, it forms an implementation of a method defined in a functional interface. It is important to note that the functional interface should contain only a single method without an implementation.

**Лямбда выражения**

Среди новшеств, которые были привнесены в язык Java с выходом JDK 8, особняком стоят лямбда-выражения. Лямбда представляет набор инструкций, которые можно выделить в отдельную переменную и затем многократно вызвать в различных местах программы.

Основу лямбда-выражения составляет лямбда-оператор, который представляет стрелку ->. Этот оператор разделяет лямбда-выражение на две части: левая часть содержит список параметров выражения, а правая собственно представляет тело лямбда-выражения, где выполняются все действия.

Лямбда-выражение не выполняется само по себе, а образует реализацию метода, определенного в функциональном интерфейсе. При этом важно, что функциональный интерфейс должен содержать только один единственный метод без реализации.


\
_code/consultation44/src/Checkable.java_
```java
public interface Checkable {
boolean check( String str);
}
```

\
_code/consultation44/src/Main.java_
```java
import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    /*
    есть файл такого вида :
    John, Smith, Notebook, 500
    Peter, Black, Mac,800
    John, Smith, Keyboard,25
     Peter, Black, Mouse ,100


    нужно написать метод, который принимает этот файл и записывает информацию в другой
    файл в таком виде:
    John Smith 525
    Peter Black  900

     */
    public static void main(String[] args) {
        String inFile = "input.csv";
        String outFile ="output.csv";

        writeToFileModified(inFile,outFile);

        /*
        Создать интерфейс  Transformable c методом modify,  который принимает
        строку и возвращает строку
        и интерфейс Checkable  c  методом check , который принимает строку и возвращает boolean
        Написать лямбды, реализующие метод соответствующего интерфейса таким образом, что:
        1. при длине строки 3 возвращается true  иначе false
        2.  строка возвращается в верхнем регистре
         */

        //Transformable transformable =
       // Checkable checkable =
    }



    public static void writeToFileModified(String inFile, String outFile){
        try(BufferedReader br = new BufferedReader(new FileReader(inFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(outFile,false)))
        {
            String line;
            Map<String,Integer> result = new HashMap<>();

            while ((line = br.readLine()) != null){
                String[] entry = line.split(",");
                String key = entry[0].trim().concat(" ").concat(entry[1].trim());
                int price = Integer.parseInt(entry[3].trim());
                int currentValue = result.getOrDefault(key,0);
                int newValue = currentValue + price;
                result.put(key,newValue);
            }

            for(Map.Entry<String,Integer> me : result.entrySet()){
                bw.write(me.getKey() +' ' + me.getValue());
                bw.newLine();
            }

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
```

\
_code/consultation44/src/Transformable.java_
```java
public interface Transformable {
    String modify(String str);
}
```

\
_code/homework44/src/Homework.java_
```java
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Homework {
    public static void main(String[] args) {
        System.out.println(Integer.parseInt("36")+1);

        System.out.println(findSum("text.txt"));

        File file = new File("longestStr.txt");
        System.out.println(findLongest(file));
    }

    /*
    Task 1
1.Пусть есть текстовый файл такого вида:
1
2
3
4
5
Нужно написать метод, принимающий файл и возвращающий сумму всех значений
     */

    public static int findSum(String fileName){
        int sum = 0;
        String intString;
        try(BufferedReader br = new BufferedReader( new FileReader(fileName))){

            while ((intString = br.readLine()) != null){
                sum = sum + Integer.parseInt(intString);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        return sum;
    }

    /*
    Task 2
Написать метод, принимающий текстовый файл, состоящий из нескольких
строчек разной длины и возвращающий самую длинную строчку.
Пример
файл:
aaa
bbbbbbbbbb
cc
вернет метод: bbbbbbbbbb
     */

    public static String findLongest(File fileName){
        String longest = "";

        try( BufferedReader br = new BufferedReader(new FileReader(fileName))){
            String line;

            while((line = br.readLine()) != null){
                if(line.length() > longest.length())
                    longest = line;
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        return longest;
    }
}
```

\
_code/io_close/src/Main.java_
```java
import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    // закрытие ресурса через try-catch-finally

    public static void main(String[] args) {
        FileInputStream fileInputStream = null;

        try {
            fileInputStream = new FileInputStream("longestStr.txt");

            int i;
            while( (i = fileInputStream.read()) != -1){
                System.out.print((char)i);
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if (fileInputStream != null)
                    fileInputStream.close();
            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }
        }

        // try-with-resources

        System.out.println("\nwith try-with-resources");

        try(FileInputStream fileInputStream1 = new FileInputStream("longestStr.txt")){
            int i;
            while((i = fileInputStream1.read()) != -1){
                System.out.print((char)i);
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());

        }
    }
}
```

\
_code/io_close/src/Person.java_
```java
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
        return "Personn{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
```

\
_code/io_close/src/Task.java_
```java
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task {
    /*
    Пусть есть текстовый файл такого вида
    Peter,37
    Simon, 5
    John, 90
    Нужно написать метод, читающий этот файл и возвращающий лист людей старше 18 лет, отсортированный
    по возрасту. Известно, что файл не пустой
    List<Personn>

     */
    public static void main(String[] args) {
        System.out.println(composeList("people.txt"));
    }
    public static List<Person> composeList(String fileName){
        List<Person> persons = new ArrayList<>();
        List<String>temp = new ArrayList<>();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
            String line;

            while ((line = bufferedReader.readLine()) != null){
                temp.add(line);
            }
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        for( String s : temp){
            String[] nameAge = s.split(",");
            int age = Integer.parseInt(nameAge[1].trim());
            if( age > 18)
                persons.add( new Person(nameAge[0].trim(),age));
        }
        Collections.sort(persons);
        return persons;
    }
}
```

\
_code/lambda_expressions/src/Arithmetical.java_
```java
public interface Arithmetical {
   int calculate( int i, int j);
}
```

\
_code/lambda_expressions/src/Eatable.java_
```java
public interface Eatable {
    String eat( String food);
}
```

\
_code/lambda_expressions/src/Flyable.java_
```java
@FunctionalInterface
public interface Flyable {
    void fly();
    //void fly1();
}
```

_code/lambda_expressions/src/Main.java_
```java
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    /*
    Лямбда - выражения
    Lambda - expresiions

    Лямбда выражения используются для реализации метода функционального интерфейса.
    Функциональным называется интерфейс, имеющий только один абстрактный метод

    (argument-list) -> {body}
    () -> {body}
    (par) -> {body}
    (par1,par2) -> {body}
     */
    public static void main(String[] args) {

        int height = 100;

        // реализация через анонимный класс
        Flyable flyable = new Flyable(){
            public void fly(){
                System.out.println("Flying at " + height);
            }
        };
        flyable.fly();


        // через лямбда-выражение

        Flyable fLambda = () -> {
            System.out.println("Flying with lambda at " + height);
        };
        fLambda.fly();

        Flyable fLambda1 = () ->{
            System.out.println("This is completely different implementation " + height);
        };
        fLambda1.fly();

        Walkable w = () -> {
            return "I can walk";
        };

        System.out.println(w.walk());

        Eatable eatable = (food) ->{
            return "A man eats " + food;
        };
        System.out.println(eatable.eat("orange"));

        Arithmetical arithmetical = (x,y) -> {
            return x + y;
        };

        System.out.println(arithmetical.calculate(1,2));

        // короткая форма записи - lambda-expression

        Arithmetical arithmetical1 = (x,y) -> x + y;
        System.out.println(arithmetical1.calculate(2,3));

        Arithmetical minus = (x,y) -> x - y;
        System.out.println( minus.calculate(4,3));

        Eatable eatableShort = f -> "A man eats " + f;

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Ann");
        names.add("Jack");
        names.add("Bill");

        names.forEach(
                n -> System.out.println(n)
        );

        List<Product> items = new ArrayList<>();
        items.add( new Product("keybord",2500));
        items.add( new Product("tvset",500));
        items.add( new Product("laptop",300));

        Collections.sort(items, (p1,p2)->p1.name.compareTo(p2.name));
        System.out.println(items);

        System.out.println("price");
        Collections.sort(items,(p1,p2)->p1.price - p2.price);
        System.out.println(items);

    }
}
```

\
_code/lambda_expressions/src/Product.java_
```java
public class Product {
    String name;
    int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
```

\
_code/lambda_expressions/src/Walkable.java_
```java
public interface Walkable {
    String walk();
}
```
\
**HOME WORK**

#### Task 1

Создать следующие интерфейсы:
Printable, содержащий метод void print(String s)
Producable, содержащий метод String produce()
Используя эти интерфейсы написать 2 лямбды, реализующие метод соответствующего интерфейса таким образом:

    строка распечатывается в виде !строка!
    возвращается строка "Hello World"

#### Task 2

Написать метод, принимающий имя файла и лист Person. Метод сохраняет в этот файл обьекты класса Person из листа ( класс Person имеет 2 поля name и age- см код занятия).
