package dec_14_2023;

import java.util.Arrays;

/*
0 1 2 3 4 5 6 7  8  9  10
    0 1 1 2 3 5 8 13 21 34 55
    Написать метод, который принимает целое число (номер числа Фибоначчи) и
    возвращает само число фибоначчи.
     При написании метода использовать массив.
 */
public class Fibonacci {

    public static long fibViaArray (int n) {
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < arr.length; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(Arrays.toString(arr));
        return arr[n -1];
    }

}
