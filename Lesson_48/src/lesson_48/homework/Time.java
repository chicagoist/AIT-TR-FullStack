package lesson_48.homework;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Time {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();


        // 1
        System.out.println("1.-текущую дату " + localDate);

        // 2
        System.out.printf("2-текущий год %d, месяц %s и день %d\n",
                localDate.getYear()
                ,localDate.getMonth()
                ,localDate.getDayOfMonth()
        );

        // 3





    }
}
/*

    Получить и вывести на экран:
    -текущую дату
    -текущий год, месяц и день
    Создать дату , например день рождения и вывести на экран
    Создать две даты и проверить на равенство
    Получить и вывести на экран текущее время
    текущее время + 3 часа
    Создать дату на неделю позже сегодняшней
    Создать даты tomorrow и yesterday и проверить находятся ли они до или
    после сегодняшней


 */