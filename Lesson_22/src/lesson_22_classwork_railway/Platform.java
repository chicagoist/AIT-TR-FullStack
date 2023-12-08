package lesson_22_classwork_railway;

import java.util.Arrays;

/*
Написать метод , находящий минимальное количество платформ, необходимых для
приема поездов
    на станции в каждый момент времени. Известно время прибытия и отправления
     поездов ( расписание)

    arrival[] = { 100, 140, 150, 200, 215, 400}
    departure[] ={110, 300, 220, 230, 315, 600}

    Алгоритм решения:
    1. Сортируем массивы прибытие и отправление
    2. Сравниваем в цикле текущие элементы массивов и выбираем меньший.
        Если элемент выбран из массива  прибытия - увеличиваем количество
        платформ.
        Если из отправления - уменьшаем
    3. Необходимо записывать текущее количество платформ в специально
    созданной для этого переменной.
    4. В конце возвращаем максимальное значение полученное для количества
    платформ.


 */
public class Platform {
    public static void main(String[] args) {

        int[] arrival = {100, 140, 150, 200, 215, 400};
        int[] departure = {110, 300, 220, 230, 315, 600};

        int minPlatformsNeeded = Platforms.minPlatforms(arrival, departure);
        System.out.println("Minimum number of platforms: " + minPlatformsNeeded);
    }


    public static class Platforms {

        public static int minPlatforms(int[] arrival, int[] departure) {
            // Сортируем массивы прибытия и отправления
            Arrays.sort(arrival);
            Arrays.sort(departure);

            int platformsNeeded = 1; // Начальное количество платформ
            int result = 1;
            int i = 1, j = 0;
            int n = arrival.length;

            // Слияния массивов для сравнения прибытия и отправления
            while(i < n && j < n) {
                if(arrival[i] <= departure[j]) {
                    platformsNeeded++;
                    i++;
                    // Обновляем максимальное количество платформ, если
                    // требуемое больше
                    if(platformsNeeded > result) {
                        result = platformsNeeded;
                    }
                } else {
                    platformsNeeded--;
                    j++;
                }
            }
            return result;
        }
    }
}
