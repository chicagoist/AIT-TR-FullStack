package lesson_28_homework;

/*
С использованием агрегации (HAS-A relationship) создать классы Кошелек (
Wallet ) и Деньги ( Money).
Вывести на печать несколько обьектов класса Wallet
 */

public class Main {
    public static void main(String[] args) {

        Wallet wallet1 = new Wallet(new Money(1, 3, 2, 4, 1, 1, 2, 1));
        Wallet wallet2 = new Wallet(new Money(0, 0, 0, 0, 10, 20, 30, 40));
        Wallet wallet3 = new Wallet(new Money(7, 6, 5, 4, 0, 0, 0, 0));

        Wallet[] arrayOfWallets = new Wallet[]{wallet1, wallet2, wallet3};

        // информацию о номере кошелька при выводе:
        for (int i = 0; i < arrayOfWallets.length; i++) {
            System.out.println("Wallet " + (i + 1) + ": " + arrayOfWallets[i]);
            System.out.println();
        }

    }
}
