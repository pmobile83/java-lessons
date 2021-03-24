package ru.sber.javaschool;

public class TradingTerminal {
    public static void main(String[] args) {
        Lesson03();
    }

    private static void Lesson03() {


        Stock stock = new Stock();
        Bond bond = new Bond();

        /*работа с акциями*/
        stock.setTicker("SBERP");
        stock.setName("\"Сбербанк привилегированные\"");
        stock.setPrice(288.33);
        stock.setLot(-115);
        stock.setCurrency("RUB");
        stock.buyAsset(stock.getTicker(), stock.getName(), stock.getCurrency(), stock.getPrice(), stock.getLot());

        stock.setPrice(300.00);
        stock.setLot(-15);
        stock.sellAsset(stock.getTicker(), stock.getName(), stock.getCurrency(), stock.getPrice(), stock.getLot());
        System.out.println();

        stock.setTicker("SBERP");
        stock.setName("\"Сбербанк привилегированные\"");
        stock.setPrice(288.33);
        stock.setLot(115);
        stock.setCurrency("RUB");
        stock.buyAsset(stock.getTicker(), stock.getName(), stock.getCurrency(), stock.getPrice(), stock.getLot());

        stock.setPrice(300.00);
        stock.setLot(15);
        stock.sellAsset(stock.getTicker(), stock.getName(), stock.getCurrency(), stock.getPrice(), stock.getLot());
        System.out.println();

        /*работа с облигациями*/
        bond.setTicker("RU000A0ZZE20");
        bond.setName("\"Сбербанк ПАО БО 001P-16R\"");
        bond.setPrice(1019.33);
        bond.setLot(-115);
        bond.setCurrency("RUB");
        bond.buyAsset(bond.getTicker(), bond.getName(), bond.getCurrency(), bond.getPrice(), bond.getLot());

        bond.setPrice(1030.00);
        bond.setLot(-15);
        bond.sellAsset(bond.getTicker(), bond.getName(), bond.getCurrency(), bond.getPrice(), bond.getLot());
        System.out.println();

        bond.setTicker("RU000A0ZZE20");
        bond.setName("\"Сбербанк ПАО БО 001P-16R\"");
        bond.setPrice(1019.33);
        bond.setLot(115);
        bond.setCurrency("RUB");
        bond.buyAsset(bond.getTicker(), bond.getName(), bond.getCurrency(), bond.getPrice(), bond.getLot());

        bond.setPrice(1030.00);
        bond.setLot(15);
        bond.sellAsset(bond.getTicker(), bond.getName(), bond.getCurrency(), bond.getPrice(), bond.getLot());

    }
}