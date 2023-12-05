package lesson_09_homework_02;

public class Solution {

  public static String decide(char unknowCharacter) {
    if (Character.isLetter(unknowCharacter)) {
      switch (unknowCharacter) {
        case 'A':
        case 'a':
        case 'E':
        case 'e':
        case 'Y':
        case 'y':
        case 'U':
        case 'u':
        case 'I':
        case 'i':
        case 'O':
        case 'o':
        case 'Ö':
        case 'ö':
        case 'Ü':
        case 'ü':
        case 'Ä':
        case 'ä':
          return ("The character " + unknowCharacter + " is a vowel");

        default:
          return ("The character " + unknowCharacter + " is consonant");
      }
    } else {
      return ("The character " + unknowCharacter + " is not a letter");
    }
  }
}
