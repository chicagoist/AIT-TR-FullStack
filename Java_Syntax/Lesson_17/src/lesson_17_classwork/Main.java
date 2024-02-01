package lesson_17_classwork;

import static lesson_17_classwork.Solution.*;

public class Main {
  public static void main(String[] args) {

    String info = "abac";

    char[] str = info.toCharArray();
    int len = str.length;
    System.out.println("removeDuplicateElements : " + removeDuplicateElements(str, len));

    // добавил новый метод removeDuplicateV2
    System.out.println("removeDuplicateV2 : " + removeDuplicateV2(str));

    // Анаграмма
    String anagramStr1 = "abac";
    String anagramStr2 = "caba";
    String anagramStr4 = "cccc";
    String anagramStr3 = "abc";
    System.out.println("Is it a Anagram? : " + checkAnagram(anagramStr1, anagramStr2));
    System.out.println("Is it a Anagram? : " + checkAnagram(anagramStr1, anagramStr4));
    System.out.println("Is it a Anagram? : " + checkAnagram(anagramStr1, anagramStr3));
  }
}
