package lesson_26_homework;

public class Main {
    public static void main(String[] args) {

        Geometry circleArea = new Circle();
        Geometry squareArea = new Square();
        Geometry rectangleArea = new Rectangle();

        circleArea.circleArea(10);
        squareArea.squareArea(12.5);
        rectangleArea.rectangleArea(5, 9);

        Geometry[] arrayOfObjects = {circleArea, squareArea, rectangleArea};

        for(Geometry object : arrayOfObjects) {
            System.out.println(object);
        }

        /*OUTPUT
        Circle has area of 314,16
        Square has area of 156,25
        Rectangle has area of 45,00
         */


    }
}
