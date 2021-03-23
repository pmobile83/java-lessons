package ru.sber.javaschool;

public class Futures extends FinancialAsset {
    public void buyAsset() {

    }

    public void sellAsset() {

    }

    public void buyAsset(String ticker, String name, String currency, double price, int lot) {
        if (price > 0 && lot > 0) {
            System.out.println("Купили " + lot + " фьюч. " + name + " (тикер: " + ticker + ") на общую сумму " + price * lot + " " + currency);
        }
        if (price > 0 && lot < 0) {
            System.out.println("Зашортили " + -lot + " фьюч. " + name + " (тикер: " + ticker + ") на общую сумму " + -price * lot + " " + currency);
        }
    }


    public void sellAsset(String ticker, String name, String currency, double price, int lot) {
        if (price > 0 && lot > 0) {
            System.out.println("Продали " + getLot() + " фьюч. " + name + " (тикер: " + ticker + ") на общую сумму " + price * lot + " " + currency);
        }
        if (price > 0 && lot < 0) {
            System.out.println("Откупили шорт " + -lot + " фьюч. " + name + " (тикер: " + ticker + ") на общую сумму " + -price * lot + " " + currency);
        }
    }
}
