package lesson_17_classwork;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        String info = "abac";

        char[] str = info.toCharArray();
        int len = str.length;
        removeDuplicateElements(str, len);

        // добавил новый метод
        System.out.println("removeDuplicateV2 : "+removeDuplicateV2(str));
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

    static void removeDuplicateElements(char[] str, int length) {
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
        System.out.println(String.valueOf(Arrays.copyOf(str, index)));
    }
}


