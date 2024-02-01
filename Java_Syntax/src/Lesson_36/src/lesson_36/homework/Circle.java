package lesson_36.homework;

public class Circle implements Shape {
    private final double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        //S = π · r2
        return Math.PI * (Math.pow(this.radius, 2));
    }

    @Override
    public double calculatePerimeter() {
        //C = 2 · π · r
        return 2 * Math.PI * this.radius;
    }
}
