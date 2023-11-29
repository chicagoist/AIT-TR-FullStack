package lesson_14_homework_task_01;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        int[] numbersArray0 = {1, 2, 3, 4, 5};
        int[] numbersArray1 = {1, 2, 3, 4, 6};
        int[] numbersArray2 = {1, 2, 3, 4, 5};

        System.out.println("###########################################");
        System.out.println("numbersArray0 have numbers: " + Arrays.toString(numbersArray0));
        System.out.println("numbersArray1 have numbers: " + Arrays.toString(numbersArray1));
        System.out.println("numbersArray2 have numbers: " + Arrays.toString(numbersArray2));
        System.out.println("###########################################");


        System.out.println("Compare arrays numbersArray0 and numbersArray1 is" +
                " = " + compare(numbersArray0, numbersArray1));
        System.out.println("Compare arrays numbersArray0 and numbersArray2 is" +
                " = " + compare(numbersArray0, numbersArray2));
        System.out.println("Compare arrays numbersArray1 and numbersArray2 is" +
                " = " + compare(numbersArray1, numbersArray2));

    }

    private static boolean compare(int[] array1, int[] array2) {

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
