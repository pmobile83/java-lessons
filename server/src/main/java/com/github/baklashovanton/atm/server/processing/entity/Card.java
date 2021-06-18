package com.github.baklashovanton.atm.server.processing.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "Cards")
@NoArgsConstructor
@Getter
@Setter
public class Card {

    @Id
    @GeneratedValue
    private Long id;
    private String cardNumber;
    private String cardholder;
    private LocalDate cardExpire;
    private int pin;
    private int cvc2;

    @ManyToOne
    @JoinColumn(name = "account_id", nullable = false)
    private Account account_id;
}