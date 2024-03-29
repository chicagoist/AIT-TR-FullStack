package testPractice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution1 {
    public static void main(String[] args) {
        List<Map<String, String>> employees = Arrays.asList(
                Map.of("Имя", "Кирилл", "Возраст", "26", "Должность", "Middle java dev", "Зарплата", "150000 руб"),
                Map.of("Имя", "Виталий", "Возраст", "28", "Должность", "Senjor java automation QA", "Зарплата", "2000$"),
                Map.of("Имя", "Александр", "Возраст", "31", "Должность", "junior functional tester", "Зарплата", "50000 руб"),
                Map.of("Имя", "Дементий", "Возраст", "35", "Должность", "dev-ops", "Зарплата", "1500$")
        );

        //младше 30
        List<String> youngerThan30 = employees.stream()
                .filter(element -> Integer.parseInt(element.get("Возраст")) < 30)
                .map(element -> element.get("Имя"))
                .collect(Collectors.toList());
        System.out.println("Имена всех сотрудников младше 30: " + youngerThan30);

        //зарплата в рублях
        List<String> rubSalary = employees.stream()
                .filter(element -> element.get("Зарплата").endsWith("руб"))
                .map(element -> element.get("Имя"))
                .collect(Collectors.toList());
        System.out.println("Имена всех сотрудников с зарплатой в рублях: " + rubSalary);

        //средний возраст
        double averAge = employees.stream()
                .mapToInt(element -> Integer.parseInt(element.get("Возраст")))
                .average()
                .orElse(0);
        System.out.println("Средний возраст всех сотрудников: " + averAge);
    }
}
