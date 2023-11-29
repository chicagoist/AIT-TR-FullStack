package lesson_14_homework_task_02;

public class Solution {
    public static void main(String[] args) {

        int[] numbersArray0 = {1, 2, 3, 4, 5};
        int[] numbersArray1 = {1, 2, 3, 5, 7};
        int[] numbersArray2 = {2};
        int[] numbersArray3 = {};


        System.out.println("The number of even numbers in numbersArray0 is = "
                + evenNumbers(numbersArray0));
        System.out.println("The number of even numbers in numbersArray1 is = "
                + evenNumbers(numbersArray1));
        System.out.println("The number of even numbers in numbersArray2 is = "
                + evenNumbers(numbersArray2));
        System.out.println("The number of even numbers in numbersArray3 is = "
                + evenNumbers(numbersArray3));

    }

    private static int evenNumbers(int[] array) {
        int index = 0;

        if(array.length != 0) {
            for(int i = 0; i < array.length; i++) {
                if(array[i] % 2 == 0) {
                    index++;
                }
            }
        }

        return index;
    }
}
