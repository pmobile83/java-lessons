package ru.sber.javaschool;

public class Bond extends FinancialAsset {
    public void buyAsset() {

    }

    public void sellAsset() {

    }

    public void buyAsset(String ticker, String name, String currency, double price, int lot) {
        if (price > 0 && lot > 0) {
            System.out.println("Купили " + lot + " обл. " + name + " (тикер: " + ticker + ") на общую сумму " + price * lot + " " + currency);
        }
        if (price > 0 && lot < 0) {
            System.out.println("Шортить облигации нельзя");
        }
    }


    public void sellAsset(String ticker, String name, String currency, double price, int lot) {
        if (price > 0 && lot > 0) {
            System.out.println("Продали " + getLot() + " обл. " + name + " (тикер: " + ticker + ") на общую сумму " + price * lot + " " + currency);
        }
        if (price > 0 && lot < 0) {
            System.out.println("Облигаций в шорте быть не может!");
        }
    }
}
