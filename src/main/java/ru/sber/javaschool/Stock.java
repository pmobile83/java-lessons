package ru.sber.javaschool;

public class Stock extends FinancialAsset {
    public void buyAsset() {

    }

    public void sellAsset() {

    }

    public void buyAsset(String ticker, String name, String currency, double price, int lot) {
        if (price > 0 && lot > 0) {
            System.out.println("Купили " + lot + " акц. " + name + " (тикер: " + ticker + ") на общую сумму " + price * lot + " " + currency);
        }
        if (price > 0 && lot < 0) {
            System.out.println("Зашортили " + -lot + " акц. " + name + " (тикер: " + ticker + ") на общую сумму " + -price * lot + " " + currency);
        }
    }


    public void sellAsset(String ticker, String name, String currency, double price, int lot) {
        if (price > 0 && lot > 0) {
            System.out.println("Продали " + getLot() + " акц. " + name + " (тикер: " + ticker + ") на общую сумму " + price * lot + " " + currency);
        }
        if (price > 0 && lot < 0) {
            System.out.println("Откупили шорт " + -lot + " акц. " + name + " (тикер: " + ticker + ") на общую сумму " + -price * lot + " " + currency);
        }
    }


}
