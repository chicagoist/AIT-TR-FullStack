package lesson_27_homework_pizza;

public class PizzaChoice {

    public static Pizza orderPizza(String typeOfPizza) {

        if("Гавайи".equalsIgnoreCase(typeOfPizza)) {
            return new PizzaHawaii(typeOfPizza);
        } else if("Салями".equalsIgnoreCase(typeOfPizza)) {
            return new PizzaSalami(typeOfPizza);
        } else if("Маргарита".equalsIgnoreCase(typeOfPizza)) {
            return new PizzaMargarita(typeOfPizza);
        }
        return null;
    }
}
