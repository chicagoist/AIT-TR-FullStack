package lesson_13_homework_task_01;

/*
Задача1

-Cоздать массив строк fruits (фрукты) из 4 элементов: Orange,Apple,Banana,Mango.
-Вывести созданный массив на экран используя цикл for.
-Заменить в созданном массиве значение первого элемента на Kiwi (т.е. присвоить
первому элементу значение Kiwi)
-Вывести измененный массив на экран используя цикл for.
Задание можно выполнить непосредственно в методе main, не создавая
отдельный метод.
 */


public class Solution {
    public static void main(String[] args) {

        String[] fruitsArray = {"Orange", "Apple", "Banana", "Mango" };

        for(int i = 0; i < fruitsArray.length; i++) {
            System.out.println(fruitsArray[i]);
        }

        fruitsArray[0] = "Kiwi";
        System.out.println("***************");

        for(String s : fruitsArray) {
            System.out.println(s);
        }
    }
}
