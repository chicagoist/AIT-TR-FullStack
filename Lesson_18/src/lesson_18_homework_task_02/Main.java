package lesson_18_homework_task_02;

public class Main {
    public static void main(String[] args) {
        Rectangle firstRectangle = new Rectangle(10, 5);
        Rectangle secondRectangle = new Rectangle(2, 6);
        Rectangle thirdRectangle = new Rectangle(4, 4);

        System.out.println(
                "firstRectangle has a area: "
                        + firstRectangle.getRectangleArea()
                        + " and perimeter: "
                        + firstRectangle.getRectanglePerimeter());
        System.out.println(
                "secondRectangle has a area: "
                        + secondRectangle.getRectangleArea()
                        + " and perimeter: "
                        + secondRectangle.getRectanglePerimeter());
        System.out.println(
                "thirdRectangle has a area: "
                        + thirdRectangle.getRectangleArea()
                        + " and perimeter: "
                        + thirdRectangle.getRectanglePerimeter());

    /*
    firstRectangle has a area: 50 and perimeter: 30
    secondRectangle has a area: 12 and perimeter: 16
    thirdRectangle has a area: 16 and perimeter: 16
     */

    }
}
