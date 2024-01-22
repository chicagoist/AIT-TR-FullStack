package lesson_43.homework;


public class Main {
    public static void main(String[] args) {
        // Task 1
        SumResult readFile = new SumResult("numbers.txt");
        System.out.println(readFile.getSum());

        // Task 2
        MaxString maxString = new MaxString("longstring.txt");
        System.out.println(maxString.getLongestString());

    }


}
/* OUTPUT

10
привет мир!

Process finished with exit code 0

 */