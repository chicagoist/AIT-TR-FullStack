package lesson_31_homework_interface;

public interface Shape {

    void circleArea(double radius);
    void circlePerimeter(double radius);

    void rectanglePerimeter(double side_a, double side_b);
    void rectangleArea(double side_a, double side_b);

    double getPerimeterOfRectangle();
    double getAreaOfRectangle();

    double getCircumference();
    double getAreaOfcircle();

}
