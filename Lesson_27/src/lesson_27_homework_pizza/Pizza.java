package lesson_27_homework_pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pizza {
    void prepare() {

        System.out.print("Мы создаём для вас пиццу ");

    }

    public void bake() {
        System.out.print("Для вас уже печётся пицца ");
    }

    void pack() {
        System.out.println("Ваша пицца упаковывается для доставки.");
        try {
            System.out.print("Желаете попробовать ещё одну пиццу? " +
                    "[Y]es/[N]o: ");
            String answer =
                    new BufferedReader(new InputStreamReader(System.in)).readLine();

            if(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
                OnlinePizzaShop.choosePizza();
            } else {
                System.out.println("Спасибо за посещение нашей пиццерии. До " +
                        "свидания!");
                return;
            }

            OnlinePizzaShop.choosePizza();
        } catch(IOException e) {
            throw new RuntimeException(e);
        }

    }
    public String toString() {
        return "Вы выбрали пиццу ";
    }
}
