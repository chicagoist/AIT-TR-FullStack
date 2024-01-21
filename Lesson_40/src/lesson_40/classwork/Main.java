package lesson_40.classwork;
/*
Написать метод, принимающий не пустой лист строк и возвращающий строку,
которая встречается раньше в листе - самую короткую или самую длинную.
Все строки в листе разной длины
 */


import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Java");
        stringList.add("Python");
        stringList.add("C++");
        stringList.add("JavaScript");


        String result = StringListFinder.findFirstString(stringList);
        System.out.println("Результат: " + result);
    }

}
