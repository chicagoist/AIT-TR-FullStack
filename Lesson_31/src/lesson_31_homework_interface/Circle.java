package lesson_31_homework_interface;

public class Circle implements Shape{
    private double circumference;
    private double areaOfcircle;

    Circle (double radius) {
        circleArea(radius);
        circlePerimeter(radius);
    }

    @Override
    public void circleArea(double radius) {
        //S = π · r2
        this.areaOfcircle = Math.PI * (Math.pow(radius,2));
    }

    @Override
    public void circlePerimeter(double radius) {
        //C = 2 · π · r
        this.circumference = 2 * Math.PI * radius;
    }

    public double getCircumference() {
        return circumference;
    }

    public double getAreaOfcircle() {
        return areaOfcircle;
    }



    @Override
    public void rectanglePerimeter(double side_a, double side_b) {

    }

    @Override
    public void rectangleArea(double side_a, double side_b) {

    }

    @Override
    public double getPerimeterOfRectangle() {
        return 0;
    }

    @Override
    public double getAreaOfRectangle() {
        return 0;
    }
}
