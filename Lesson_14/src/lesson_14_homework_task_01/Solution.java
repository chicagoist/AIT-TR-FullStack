package lesson_14_homework_task_01;

public class Solution {

    static boolean compare(int[] array1, int[] array2) {

        boolean result = false;
        int index = 0;

        if(array1.length != array2.length) {
            return result;
        } else {
            for(int i = 0; i < array1.length; i++) {
                if(array1[i] == array2[i]) {
                    index++;
                }
            }

            if(index == array2.length) {
                result = true;
            }
        }


        return result;
    }
}
