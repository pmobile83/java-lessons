package com.github.baklashovanton.atm.atm;

import java.math.BigDecimal;

public class Function {
    private static BigDecimal balance;

    public static BigDecimal getBalance() {
        BigDecimal balance = BigDecimal.valueOf(0.0);
        balance = balance.add(BigDecimal.valueOf(Math.random() * 10000));
        return balance.setScale(2, BigDecimal.ROUND_HALF_UP);
    }
}
