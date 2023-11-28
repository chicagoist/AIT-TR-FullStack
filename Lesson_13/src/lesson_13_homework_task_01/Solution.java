package lesson_13_homework_task_01;

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
