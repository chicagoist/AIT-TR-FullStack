package lesson_17_classwork;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {

        String info = "abac";
        char[] str = info.toCharArray();
        int len = str.length;
        removeDuplicateElements(str, len);
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


