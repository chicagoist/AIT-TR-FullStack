package lesson_46.homework;

import org.jetbrains.annotations.NotNull;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Unique {
    protected static void getUniqueElements(@NotNull List<String> list) {
        Stream<String> stream = list.stream();
        stream.map(name -> {
            Optional<String> nameNotNull = Optional.ofNullable(name);
            return nameNotNull.isPresent() ? nameNotNull.get() : "null";
        }).distinct().forEach(System.out::println);
    }
}
