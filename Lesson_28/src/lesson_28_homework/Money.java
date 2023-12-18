package lesson_28_homework;

public class Money {

    private int coins1 = 0; // how 1c coins
    private int coins5 = 0; // how 5c coins
    private int coins10 = 0; // how 10c coins
    private int coins25 = 0; // how 20c coins

    private int banknote5 = 0; // how 5Euro banknotes
    private int banknote10 = 0; // how 10Euro banknotes
    private int banknote20 = 0; // how 20Euro banknotes
    private int banknote50 = 0; // how 50Euro banknotes

    public int getCoins1() {
        return coins1;
    }

    public int getCoins5() {
        return coins5;
    }

    public int getCoins10() {
        return coins10;
    }

    public int getCoins25() {
        return coins25;
    }

    public int getBanknote5() {
        return banknote5;
    }

    public int getBanknote10() {
        return banknote10;
    }

    public int getBanknote20() {
        return banknote20;
    }

    public int getBanknote50() {
        return banknote50;
    }

    public Money(int coins1, int coins5, int coins10, int coins25,
                 int banknote5, int banknote10, int banknote20,
                 int banknote50) {
        this.coins1 = coins1;
        this.coins5 = coins5;
        this.coins10 = coins10;
        this.coins25 = coins25;
        this.banknote5 = banknote5;
        this.banknote10 = banknote10;
        this.banknote20 = banknote20;
        this.banknote50 = banknote50;
    }
}
