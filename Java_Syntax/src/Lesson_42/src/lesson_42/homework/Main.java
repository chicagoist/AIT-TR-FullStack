package lesson_42.homework;

/*
   Поймать исключение (с выводом на экран его типа),которое возникает при
   выполнении следующего кода int a = 40/0

   Поймать исключение (с выводом на экран его типа),которое возникает при
   выполнении следующего кода
   String s =null;
   String m = s.toLowerCase()

   Поймать исключение (с выводом на экран его типа),которое возникает при
   выполнении следующего кода
   int[] m = new int[2]
   m[8]=5

*/

import java.util.*;

public class Main {
    public static void main(String[] args) {

        try {
            String s = null;
            String m = s.toLowerCase();

        } catch(NullPointerException n) {
            System.out.println("NullPointerException : " + n.getMessage());
        }

        try {
            int a = 40 / 0;
        } catch(ArithmeticException a) {
            System.out.println("ArithmeticException = " + a.getMessage());
        }

        try {
            int[] m = new int[2];
            m[8] = 5;
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException = " + e.getMessage());
        }
        ArrayList<String> stringArrayList =
                new ArrayList<>(Arrays.asList("john", "mary", "ojnh", "bill",
                        "njoh", "amry"));

        System.out.println(getAnagram(stringArrayList, "john"));
    }

  /*
  Задача2* (не обязательно)

  Написать метод, который принимает список имен и их анаграмм и имя, по которому
  он возвращает список всех его анаграмм, включая само имя. При решении
  использовать мапу.
  Пример: [john, mary, ,jonh, bill, njoh, amry], john -> [ojhn,jonh,njoh]
  (все буквы в словах маленькие)
   */

    private static List<String> getAnagram(ArrayList<String> list, String _name) {
        Map<String, Integer> ourMap = new HashMap<>();
        List<String> resultList = new ArrayList<>();
        int index = 1;

        for(String str : list) {

            if(str.length() == _name.length()) {
                char[] inArray = str.toCharArray();
                char[] secArray = _name.toCharArray();

                Arrays.sort(inArray);
                Arrays.sort(secArray);

                if(Arrays.equals(inArray, secArray)) {
                    ourMap.put(str, index);
                    index++;
                }
            }
        }
        resultList.addAll(ourMap.keySet());
        return resultList;
    }
}
/* OUTPUT
NullPointerException : null
ArithmeticException = / by zero
ArrayIndexOutOfBoundsException = Index 8 out of bounds for length 2
[ojnh, njoh, john]


Process finished with exit code 0
 */

