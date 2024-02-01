package lesson_28_homework;

public class Wallet {

    Money sweetMoney;

    public Wallet(Money sweetMoney) {
        this.sweetMoney = sweetMoney;
    }

    @Override
    public String toString() {
        return String.format("coins1=%d, coins5=%d, coins10=%d, " +
                        "coins25=%d, " +
                        "banknote5=%d, banknote10=%d, banknote20=%d, " +
                        "banknote50=%d",
                sweetMoney.getCoins1(), sweetMoney.getCoins5(),
                sweetMoney.getCoins10(),
                sweetMoney.getCoins25(), sweetMoney.getBanknote5(),
                sweetMoney.getBanknote10(),
                sweetMoney.getBanknote20(), sweetMoney.getBanknote50());
    }
}
