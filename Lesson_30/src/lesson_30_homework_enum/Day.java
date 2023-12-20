package lesson_30_homework_enum;

public class Day {

    private final String day;
    private final Week[] WEEKENDS = { Week.SATURDAY, Week.SUNDAY };

    Day(String weekDay) {
        try {// проверку предложила IDEA
            this.day = Week.valueOf(weekDay.toUpperCase()).name();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Invalid day entered");
        }
    }

    public String getWeekDay() {
        return this.day;
    }

    public boolean askForWeekend() {
        Week dayOfWeek = Week.valueOf(getWeekDay());

        for (Week weekend : WEEKENDS) {
            if (dayOfWeek == weekend) {
                return true; // День выходной
            }
        }
        return false; // День рабочий
    }
}