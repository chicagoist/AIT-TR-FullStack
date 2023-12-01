package lesson_17_classwork;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        String info = "abac";

        char[] str = info.toCharArray();
        int len = str.length;
        System.out.println("removeDuplicateElements : " + removeDuplicateElements(str, len));

        // добавил новый метод removeDuplicateV2
        System.out.println("removeDuplicateV2 : " + removeDuplicateV2(str));

        //Анаграмма
        String anagramStr1 = "abac";
        String anagramStr2 = "caba";
        String anagramStr4 = "cccc";
        String anagramStr3 = "abc";
        System.out.println("Is it a Anagram? : " + checkAnagram(anagramStr1,anagramStr2));
        System.out.println("Is it a Anagram? : " + checkAnagram(anagramStr1,anagramStr4));
        System.out.println("Is it a Anagram? : " + checkAnagram(anagramStr1,anagramStr3));
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

    private static String removeDuplicateV2(char[] str) {

        String result = String.valueOf(str[0]);

        for(char c : str) {
            if(result.indexOf(c) == -1) {
                result = result + c;
            }
        }

        return result;
    }

    static String removeDuplicateElements(char[] str, int length) {
        int index = 0;

        for(int i = 0; i < length; i++) {

            int j;
            for(j = 0; j < i; j++) {
                if(str[i] == str[j]) {
                    break;
                }
            }

            if(j == i) {
                str[index++] = str[i];
            }
        }
        return (String.valueOf(Arrays.copyOf(str, index)));
    }
}


