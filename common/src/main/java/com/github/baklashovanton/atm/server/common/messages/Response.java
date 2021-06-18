package com.github.baklashovanton.atm.server.common.messages;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@AllArgsConstructor
@Getter
@Setter
public class Response {
    private BigDecimal balance;
    private String currency;
}
