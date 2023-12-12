package dec_12_2023;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Boy sergeyIvanov = new Boy("Sergey", "Ivanov", 12, 13, "2A", "мальчик");
        System.out.println(sergeyIvanov.toString());

        Girl oksanaSavchenko = new Girl("Oksana", "Savchenko", 13, 13, "2B",
                "девушка");
        System.out.println(oksanaSavchenko.toString());

        Pupil[] arrayOfPupils = {sergeyIvanov, oksanaSavchenko};

        System.out.println(Arrays.toString(arrayOfPupils));

        /*OUT
        First name = Sergey, Second name = Ivanov, age = 12. He is a мальчик
        and Sergey makes stools

        First name = Oksana, Second name = Savchenko, age = 13. He is a девушка
        and Oksana cooks soup

       [First name = Sergey, Second name = Ivanov, age = 12. He is a мальчик
       and Sergey makes stools, First name = Oksana, Second name = Savchenko, age = 13.
       She is a девушка and Oksana cooks soup]
         */
    }
}
