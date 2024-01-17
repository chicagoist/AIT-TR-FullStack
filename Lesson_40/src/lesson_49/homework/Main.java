package lesson_49.homework;

/*

Дана Map<String, String> map, написать метод, который вернет Мап, такую,
что если в исходной map есть ключи ‘a’ и ‘b’, то нужно создать новый ключ ‘ab’
с суммой значений от ключей a и b. Если нет, ничего не менять.
Примеры:
mapAB({"a": "Hi", "b": "There"}) → {"a": "Hi", "ab": "HiThere", "b": "There"}
mapAB({"a": "Hi"}) → {"a": "Hi"}
mapAB({"b": "There"}) → {"b": "There"}

 */

import java.util.HashMap;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    MapProcessor mapProcessor = new MapProcessor();

    Map<String, String> stringMap = new HashMap<>();
    stringMap.put("a", "Hi");
    stringMap.put("b", "There");

    System.out.println(mapProcessor.keysFinder(stringMap));

    stringMap.clear();
    stringMap.put("a", "Hi");
    stringMap.put("c", "World");

    System.out.println(mapProcessor.keysFinder(stringMap));

    stringMap.clear();

    System.out.println(mapProcessor.keysFinder(stringMap));
  }
}
/* OUTPUT

{a=Hi, ab=HiThere, b=There}
{a=Hi, c=World}
{}

Process finished with exit code 0


 */