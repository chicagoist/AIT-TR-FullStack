package lesson_48.homework;

import java.time.LocalDate;
import java.time.LocalTime;

public class Time {
    public static void main(String[] args) {


        // 1
        LocalDate localDate = LocalDate.now();
        System.out.println("1.Текущая дата " + localDate);

        // 2
        System.out.printf("2.Текущий год %d, месяц %s и день %d\n",
                localDate.getYear()
                , localDate.getMonth()
                , localDate.getDayOfMonth()
        );

        // 3
        LocalDate changedDate = LocalDate.of(1974, 12, 15);
        System.out.println("3.День Рождения: " + changedDate);

        // 4
        System.out.println("4.Is changedDate equal localDate = "
                + changedDate.isEqual(localDate));

        // 5
        LocalTime localTime = LocalTime.now();
        System.out.printf("5.Текущее время %d:%d:%d\n"
                , localTime.getHour()
                , localTime.getMinute()
                , localTime.getSecond()
        );

        // 6
        LocalTime localTimePlus3 = localTime.plusHours(3);
        System.out.printf("6.Текущее время + 3 часа: %d:%d:%d\n"
                , localTimePlus3.getHour()
                , localTimePlus3.getMinute()
                , localTimePlus3.getSecond()
        );

        // 7
        LocalDate addedMorWeek = localDate.plusWeeks(3);
        System.out.println("7.Дата на неделю позже сегодняшней "
                + addedMorWeek);

        // 8
        LocalDate yesterday = localDate.minusDays(1);
        LocalDate tomorrow = localDate.plusDays(1);
        System.out.printf("8.Is yesterday before(%s) or after(%s) today's " +
                        "date?\n\tIs tomorrow before(%s) or after(%s) " +
                        "today's?\n"
                , yesterday.isBefore(localDate)
                , yesterday.isAfter(localDate)
                , tomorrow.isBefore(localDate)
                , tomorrow.isAfter(localDate)
        );
    }
}
/*OUTPUT
1.Текущая дата 2024-01-29
2.Текущий год 2024, месяц JANUARY и день 29
3.День Рождения: 1974-12-15
4.Is changedDate equal localDate = false
5.Текущее время 19:8:36
6.Текущее время + 3 часа: 22:8:36
7.Дата на неделю позже сегодняшней 2024-02-19
8.Is yesterday before(true) or after(false) today's date?
	Is tomorrow before(false) or after(true) today's?

Process finished with exit code 0
 */