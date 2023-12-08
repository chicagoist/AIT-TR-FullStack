package lesson_22_homework;

import java.util.Arrays;

public class Car {

    private String[] arrayOfSalon;


    public Car(String[] salon) {

        setArrayOfSalon(salon);
    }

    private void setArrayOfSalon(String[] salon) {

        this.arrayOfSalon = salon;
    }

    public void findCar(String carToFind) {

        if(Arrays.binarySearch(arrayOfSalon, carToFind) >= 0) {
            System.out.println("This car is in stock " + carToFind);
        } else {
            System.out.println("There is no such car, take it " + Arrays.toString(arrayOfSalon));
        }
    }
}
