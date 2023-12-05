package lesson_19_homework;

public class Temperature {

    private final double fahrenheit;
    public Temperature(double fahrenheit) {
        this.fahrenheit = fahrenheit;
    }

    public double getFahrenheit() {
        return this.fahrenheit;
    }

    protected double celsius() {
        // С = 5*(F-32)/9
        return (5.0 * (getFahrenheit()  - 32.0)) / 9;
    }
}
