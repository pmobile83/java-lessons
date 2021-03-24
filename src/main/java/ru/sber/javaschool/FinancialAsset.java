package ru.sber.javaschool;

import lombok.Data;

@Data

public abstract class FinancialAsset implements Operation {
    private String ticker = "";
    private String name = "";
    private String currency = "";
    private double price = 0.0;
    private int lot = 0;

    public abstract void buyAsset(String ticker, String name, String currency, double price, int lot);

    public abstract void sellAsset();

    public void setPrice(double price) {
        if (price > 0.0) {
            this.price = price;
        } else {
            System.out.println("Цена должна быть больше нуля!");
        }
    }
}
