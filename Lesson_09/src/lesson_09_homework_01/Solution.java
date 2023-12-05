package lesson_09_homework_01;

public class Solution {

  protected static String zeroPositiveOrNegative(int number) {
    if (number > 0) {
      return ("The number " + number + " is positive");
    } else if (number < 0) {
      return ("The number " + number + " is negative");
    } else {
      return ("The number " + number + " is zero");
    }
  }
}
