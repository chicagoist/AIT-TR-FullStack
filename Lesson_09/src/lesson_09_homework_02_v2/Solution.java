package lesson_09_homework_02_v2;

public class Solution {

  protected static String checkLetter(char ch) {
    if (Character.isLetter(ch)) {
      switch (Character.toLowerCase(ch)) {
        case 'a':
        case 'ä':
        case 'e':
        case 'i':
        case 'o':
        case 'ö':
        case 'u':
        case 'ü':
          return ch + " is a vowel.";
        default:
          return ch + " is a consonant.";
      }
    } else {
      return "The symbol is not a letter.";
    }
  }
}
