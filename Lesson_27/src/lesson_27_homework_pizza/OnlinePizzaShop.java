package lesson_27_homework_pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;


public class OnlinePizzaShop {
    public static void main(String[] args) throws IOException {
        choosePizza();
    }

    public static void choosePizza() throws IOException {

        Scanner myScanner = new Scanner(System.in);
        String[] arrayOfPizzasName = {"Гавайи", "Маргарита", "Салями"};
        int index = 0;

        for(String typeOfPizza : arrayOfPizzasName) {
            System.out.println("Пицца " + typeOfPizza + " : " + ++index);
        }

        System.out.print("Выберити номер желаемой пиццы : ");

        while(!myScanner.hasNextInt()) {
            System.out.print("Это не число! Пожалуйста, введите число: ");
            myScanner.next();
        }

        int pizzaNumber = myScanner.nextInt();
        if(pizzaNumber < 1 || pizzaNumber > arrayOfPizzasName.length) {
            System.out.print("Это был не верный номер. Желаете попробовать " +
                    "ещё раз? [Y]es/[N]o: ");
            String myanswer =
                    new BufferedReader(new InputStreamReader(System.in)).readLine();

            if(myanswer.equalsIgnoreCase("yes") || myanswer.equalsIgnoreCase(
                    "y")) {
                choosePizza();
            } else {
                System.out.println("Спасибо за посещение нашей пиццерии. До " +
                        "свидания!");
                return;
            }
        }

        if(Arrays.asList(arrayOfPizzasName).contains(arrayOfPizzasName[pizzaNumber - 1])) {
            Pizza newPizza =
                    PizzaChoice.orderPizza(arrayOfPizzasName[pizzaNumber - 1]);
            assert newPizza != null;
            System.out.println(newPizza.toString());
            newPizza.prepare();
            newPizza.bake();
            newPizza.pack();

        } else {
            System.out.print("Ошибочный номер, Желаете попробовать ещё " +
                    "раз? " +
                    "[Y]es/[N]o: ");
            String answer =
                    new BufferedReader(new InputStreamReader(System.in)).readLine();

            if(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
                choosePizza();
            } else {
                System.out.println("Спасибо за посещение нашей пиццерии. До " +
                        "свидания!");
            }
        }
    }
}