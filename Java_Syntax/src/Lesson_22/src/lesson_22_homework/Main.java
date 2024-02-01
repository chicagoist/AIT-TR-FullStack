package lesson_22_homework;

/*
Написать класс, содержащий метод, который проверяет есть ли данная машина в
салоне.
В случае, если машина найдена, метод выводит на экран сообщение "Эта машина
имеется в наличии"
Если нет, то сообщение "Такой машины нет , возьмите ( дальше следует
перечисление всех машин в салоне ) "
Результат работы метода вывести на экран в классе Main. Список машин в салоне
 должен передаваться через конструктор при создании обьекта, а название
 заказанной машины в качестве параметра метода.
Пример:String [] salon = {"Audi","BMW","Ford","Honda","Hyundai","Kia","Mazda"};

public void findCar(String carToFind)
 */
public class Main {
    public static void main(String[] args) {


        String[] salon = {"Audi", "BMW", "Ford", "Honda", "Hyundai", "Kia",
                "Mazda"};

        Car findMyCar = new Car(salon);
        findMyCar.findCar("BMW");
        findMyCar.findCar("GAZ");
    }
}
