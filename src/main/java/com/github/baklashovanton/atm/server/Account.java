package com.github.baklashovanton.atm.server;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Account {
    private String number;
    private String balance;
    private Currency currency;
    private List<String> cardNums = new ArrayList<>();

    public void addCard(String cardNum) {
        cardNums.add(cardNum);
    }
}
