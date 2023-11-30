package lesson_15_homework_task_01;

public class Solution {
    public static void main(String[] args) {

        int[] firstArray = {10, 15, 10, 1, 25, 10};
        int[] secondArray = {10, 15, 10, 1, 25, 40};

        System.out.println(equalsToThirty(firstArray));
        System.out.println(equalsToThirty(secondArray));
    }

    private static boolean equalsToThirty(int[] array) {
        boolean result = false;
        int index = 0;

        for(int j : array) {

            if(j == 10) {

                index++;
            }
        }


        if(index * 10 == 30) {
            result = true;
        }


        return result;
    }
}
