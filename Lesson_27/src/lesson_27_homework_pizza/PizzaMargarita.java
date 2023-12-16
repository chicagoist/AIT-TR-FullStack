package lesson_27_homework_pizza;

public class PizzaMargarita extends Pizza {

    private final String nameOfPizza;

    public PizzaMargarita(String typeOfPizza) {
        this.nameOfPizza = typeOfPizza;
    }

    public String getNameOfPizza() {
        return nameOfPizza;
    }

    @Override
    public void prepare() {
        super.prepare();
        System.out.println("\"" + getNameOfPizza() + "\".");
    }

    @Override
    public void bake() {
        super.bake();
        System.out.println("\"" + getNameOfPizza() + "\".");
    }

    public String toString() {
        return super.toString() + "\"" + getNameOfPizza() + "\"." + " И это " +
                "прекрасный выбор!";
    }
}
