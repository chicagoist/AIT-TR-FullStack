package lesson_17_homework_task_01;

/*

 */


import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {

        //Анаграмма
        String anagramStr1 = "abac";
        String anagramStr2 = "caba";
        String anagramStr4 = "cccc";
        String anagramStr3 = "abc";
        System.out.println(anagramStr1 + " & " + anagramStr2 + " Is it a Anagram? : " + checkAnagram(anagramStr1,anagramStr2));
        System.out.println(anagramStr1 + " & " + anagramStr4 + " Is it a Anagram? : " + checkAnagram(anagramStr1,anagramStr4));
        System.out.println(anagramStr1 + " & " + anagramStr3 + " Is it a Anagram? : " + checkAnagram(anagramStr1,anagramStr3));
    }

    private static boolean checkAnagram(String anagramStr1, String anagramStr2) {

        boolean result = false;
        int index = 0;

        if(anagramStr1.length() != anagramStr2.length()) {
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
