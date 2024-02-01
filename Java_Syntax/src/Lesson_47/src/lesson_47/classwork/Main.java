package lesson_47.classwork;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] arrayString = {"Hello","Java"};
        Arrays.stream(arrayString)
                .map(str -> str.split(""))
                .map(Arrays::stream)
                .forEach(System.out::println);

        // FlatMap
        String[] arrayStringFlat = {"Hello","Java"};
        Arrays.stream(arrayString)
                .map(str -> str.split(""))
                .flatMap(Arrays::stream)
                .forEach(System.out::print);

    }


}
