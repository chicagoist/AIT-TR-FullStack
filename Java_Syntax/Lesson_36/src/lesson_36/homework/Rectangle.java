package lesson_36.homework;

public class Rectangle implements Shape {

    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculatePerimeter() {
        // P = 2 * ( a + b )
        return 2 * (length + width);
    }

    @Override
    public double calculateArea() {
        // S = a * b
        return this.length * this.width;
    }
}
