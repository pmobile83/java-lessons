package com.github.baklashovanton.atm;

import com.github.baklashovanton.atm.atm.Function;
import com.github.baklashovanton.atm.client.Client;
import com.github.baklashovanton.atm.server.Account;
import com.github.baklashovanton.atm.server.Currency;
import com.github.baklashovanton.atm.server.ProcessingSystem;

public class Console {
    public static void main(String[] args) {

        System.out.println("Баланс составляет: " + Function.getBalance() + " " + Currency.USD);

        ProcessingSystem processing = new ProcessingSystem();

        Account account1 = new Account();
        account1.addCard("1111 2222 3333 4444");
        account1.addCard("2222 3333 4444 5555");
        account1.addCard("3333 4444 5555 6666");

        Account account2 = new Account();
        account2.addCard("2222 2222 3333 4444");
        account2.addCard("3333 3333 4444 5555");

        Client client = new Client();
        client.addAccount(account1);
        client.addAccount(account2);

        processing.addClient(client);
    }
}
