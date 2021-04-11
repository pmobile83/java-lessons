package com.github.baklashovanton.atm.client;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Card {
    private String cardNumber;
    private String cardholder;
    private LocalDate cardExpire;
    private int pin;
    private int cvc2;
}
