package lesson_28_homework;

public class Wallet {

    Money sweetMoney;

    public Wallet(Money sweetMoney) {
        this.sweetMoney = sweetMoney;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "coins1 = " + sweetMoney.getCoins1() +
                ", coins5 = " + sweetMoney.getCoins5() +
                ", coins10 = " + sweetMoney.getCoins10() +
                ", coins25 = " + sweetMoney.getCoins25() +
                ", banknote5 = " + sweetMoney.getBanknote5() +
                ", banknote10 = " + sweetMoney.getBanknote10() +
                ", banknote20 = " + sweetMoney.getBanknote20() +
                ", banknote50 = " + sweetMoney.getBanknote50() +
                '}';
    }
}
