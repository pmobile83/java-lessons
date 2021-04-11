package com.github.baklashovanton.atm.client;

import com.github.baklashovanton.atm.server.Account;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Client {

    private long clientNumber;
    private String lastName;
    private String firstName;
    private String middleName;
    private List<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
    }

}
