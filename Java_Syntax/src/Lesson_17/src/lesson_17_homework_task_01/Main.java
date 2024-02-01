package lesson_17_homework_task_01;

import static lesson_17_homework_task_01.Solution.checkAnagram;

public class Main {
  public static void main(String[] args) {

    // Анаграмма
    String anagramStr1 = "abac";
    String anagramStr2 = "caba";
    String anagramStr4 = "cccc";
    String anagramStr3 = "abc";
    System.out.println(
        anagramStr1
            + " & "
            + anagramStr2
            + " Is it a Anagram? : "
            + checkAnagram(anagramStr1, anagramStr2));
    System.out.println(
        anagramStr1
            + " & "
            + anagramStr4
            + " Is it a Anagram? : "
            + checkAnagram(anagramStr1, anagramStr4));
    System.out.println(
        anagramStr1
            + " & "
            + anagramStr3
            + " Is it a Anagram? : "
            + checkAnagram(anagramStr1, anagramStr3));
  }
}
