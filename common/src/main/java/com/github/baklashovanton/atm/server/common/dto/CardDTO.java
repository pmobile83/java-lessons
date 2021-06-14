package com.github.baklashovanton.atm.server.common.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
@Getter
public class CardDTO {
    private final int cardId;
    private final String cardNumber;
    private final String cardholder;
    private final LocalDate cardExpire;
    private final int pin;
    private final int cvc2;
    private final List<CardDTO> cardDTO;
}
