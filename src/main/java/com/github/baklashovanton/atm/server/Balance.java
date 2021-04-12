package com.github.baklashovanton.atm.server;

import com.github.baklashovanton.atm.atm.Function;
import lombok.Data;

@Data
public class Balance {
    public static String getBalCur() {
        return Function.getBalance() + " " + Currency.USD;
    }
}
