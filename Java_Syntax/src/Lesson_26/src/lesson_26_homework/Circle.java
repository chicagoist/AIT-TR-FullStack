package lesson_26_homework;

public class Circle extends Geometry {

    private double circleArea;

    protected void circleArea(double radius) {
        //S = π * r2
        this.circleArea = Math.PI * Math.pow(radius, 2);
    }

    public String toString() {
        return String.format(String.format("Circle has area of %.2f",
                this.circleArea));
    }
}
