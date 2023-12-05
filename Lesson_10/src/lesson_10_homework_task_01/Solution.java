package lesson_10_homework_task_01;

public class Solution {

  protected static void printCube(int number) {
    int index = 0;

    // Первый вариант

    /*        if(number != 0) {
                while(index < number) {

                    index++;
                    System.out.println(index + " в кубе " + (index * index * index));
                }
            } else {
                System.out.println("0 в кубе 0");
            }
    */

    // Второй вариант

    if (number == 0) {
      System.out.println("0 в кубе 0");
      return;
    }

    while (++index <= number) {
      System.out.println(index + " в кубе " + (index * index * index));
    }
  }
}
