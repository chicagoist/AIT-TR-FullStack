package lesson_31_homework_interface;

public class Rectangle implements Shape{

    private double perimeterOfRectangle;
    private double areaOfRectangle;

    public Rectangle(double a, double b) {
        rectanglePerimeter(a,b);
        rectangleArea(a, b);
    }

    @Override
    public void rectanglePerimeter(double side_a, double side_b) {
        // P = 2 * ( a + b )
        this.perimeterOfRectangle = 2 * (side_a + side_b);
    }

    @Override
    public void rectangleArea(double side_a, double side_b) {
        // S = a * b
        this.areaOfRectangle = side_a * side_b;
    }

    public double getPerimeterOfRectangle() {
        return perimeterOfRectangle;
    }

    public double getAreaOfRectangle() {
        return areaOfRectangle;
    }





    @Override
    public double getCircumference() {
        return 0;
    }

    @Override
    public double getAreaOfcircle() {
        return 0;
    }


    @Override
    public void circleArea(double radius) {

    }

    @Override
    public void circlePerimeter(double radius) {

    }
}
