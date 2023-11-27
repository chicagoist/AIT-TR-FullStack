package lesson_13_homework_task_03;

/*
Задача3

Дан массив целых чисел. Написать метод, возвращающий наименьший элемент массива.
public static int findMin(int[] ints)
 */


public class Solution {
    public static void main(String[] args) {

        int[] numbersArray = new int[10];

        for(int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = (int) (Math.random() * 10);
            System.out.println(numbersArray[i]);
        }

        System.out.println("Min of the random Array is = " + findMin(numbersArray));
    }


    public static int findMin(int[] ints) {

        int min = ints[0];
        for(int i = 1; i < ints.length; i++) {
            if(min > ints[i]) {
                min = ints[i];
            }
        }
        return min;
    }
}