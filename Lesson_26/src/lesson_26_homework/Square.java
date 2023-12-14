package lesson_26_homework;

public class Square extends Geometry {

    protected void squareArea(double a) {
        // S = a2
        this.squareArea = Math.pow(a, 2);
    }

    public String toString() {
        return String.format(String.format("Square has area of %.2f",
                this.squareArea));
    }
}
