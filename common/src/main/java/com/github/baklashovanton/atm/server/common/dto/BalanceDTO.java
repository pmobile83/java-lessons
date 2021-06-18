package com.github.baklashovanton.atm.server.common.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@RequiredArgsConstructor
@Getter
public class BalanceDTO {
    private final BigDecimal balance;
    private final String currency;
}