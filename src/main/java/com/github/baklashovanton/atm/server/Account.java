package com.github.baklashovanton.atm.server;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Account {
    private String number;
    private BigDecimal balance;
    private Currency currency;
    private List<String> cardNums = new ArrayList<>();

    public void addCard(String cardNum) {
        cardNums.add(cardNum);
    }
}
