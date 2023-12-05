package lesson_14_homework_task_02;

public class Solution {

     protected static int evenNumbers(int[] array) {
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
