package lesson_13_homework_task_02;

/*
Задача2

Используя цикл for вывести на экран все четные элементы массива fruits из
первой задачи.
Задание можно выполнить непосредственно в методе main либо создать отдельный
метод.
 */

public class Solution {
    public static void main(String[] args) {

        String[] fruitsArray = {"Orange", "Apple", "Banana", "Mango" };

        for(int i = 0; i < fruitsArray.length; i++) {
            if(i % 2 == 0) {
                System.out.println(fruitsArray[i]);
            }
        }
    }
}
