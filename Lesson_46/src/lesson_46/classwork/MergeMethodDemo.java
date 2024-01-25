package lesson_46.classwork;

import java.util.HashMap;
import java.util.Map;

public class MergeMethodDemo {
    /*
    метод merge()

    Map hashMap = HashMAp<>();
    hashMap.merge(key, value, remappingFunction);

    параметры:
    key - ключ, по которому можно положить значение value
    value - значение связанное с ключем key
    remapping function - используется в случае, если key ключ уже существует


     */

    public static void main(String[] args) {
        Map<String,Integer> items = new HashMap<>();
        items.put("Desktop",1000);
        items.put("TVset",600);
        items.put("Mouse",30);

        System.out.println(items);

        items.merge("Phone",250,(oldvalue, newvalue) -> oldvalue + newvalue);

        System.out.println(items);

        items.merge("Desktop", 500, Integer::sum);

        System.out.println(items);
    }
}
