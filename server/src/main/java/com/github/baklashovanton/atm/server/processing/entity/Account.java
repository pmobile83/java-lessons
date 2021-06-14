package com.github.baklashovanton.atm.server.processing.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "Accounts")
@NoArgsConstructor
@Getter
@Setter
public class Account {

    @Id
    @GeneratedValue
    private Long id;
    private String accnumber;
    private BigDecimal balance;
    private String currency;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client_id;
}
