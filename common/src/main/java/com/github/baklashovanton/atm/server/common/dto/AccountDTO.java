package com.github.baklashovanton.atm.server.common.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@RequiredArgsConstructor
@Getter
public class AccountDTO {
    private final int accountid;
    private final String accNumber;
    private final BigDecimal balance;
    private final String currency;
}
