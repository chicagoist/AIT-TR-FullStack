package lesson_27_homework_pizza;

public class PizzaChoice {

    public Pizza orderPizza(String typeOfPizza) {

        if("Гавайи".equalsIgnoreCase(typeOfPizza)){
            return new PizzaHawaii();
        } else if("Салями".equalsIgnoreCase(typeOfPizza)) {
            return new PizzaSalami();
        } else if("Маргарита".equalsIgnoreCase(typeOfPizza)) {
            return new PizzaMargarita();
        }
        return null;
    }
}
