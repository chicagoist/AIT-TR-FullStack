package lesson_26_homework;

public class Rectangle extends Geometry {

    private double rectangleArea;

    protected void rectangleArea(double a, double b) {
        // S = a · b
        this.rectangleArea = (a * b);
    }

    public String toString() {
        return String.format(String.format("Rectangle has area of %" +
                ".2f", this.rectangleArea));
        //return "Rectangle has area of " + this.rectangleArea;
    }
}
