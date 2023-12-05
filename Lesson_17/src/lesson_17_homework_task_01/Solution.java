package lesson_17_homework_task_01;

import java.util.Arrays;

public class Solution {

  protected static boolean checkAnagram(String anagramStr1, String anagramStr2) {

    if (anagramStr1.length() != anagramStr2.length()) {
      return false;
    }

    char[] content1 = anagramStr1.toCharArray();
    Arrays.sort(content1);
    anagramStr1 = Arrays.toString(content1);

    char[] content2 = anagramStr2.toCharArray();
    Arrays.sort(content2);
    anagramStr2 = Arrays.toString(content2);

    return anagramStr1.equals(anagramStr2);
  }
}
