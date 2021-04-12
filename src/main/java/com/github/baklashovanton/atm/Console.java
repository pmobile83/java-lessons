package com.github.baklashovanton.atm;

import com.github.baklashovanton.atm.client.Client;
import com.github.baklashovanton.atm.server.Account;
import com.github.baklashovanton.atm.server.Balance;
import com.github.baklashovanton.atm.server.ProcessingSystem;

public class Console {
    public static void main(String[] args) {

        ProcessingSystem processing = new ProcessingSystem();

        Client client1 = new Client();
        Client client2 = new Client();
        processing.addClient(client1);
        processing.addClient(client2);

        Account account1 = new Account();
        account1.addCard("1111 2222 3333 4444");
        account1.addCard("2222 3333 4444 5555");
        account1.addCard("3333 4444 5555 6666");

        Account account2 = new Account();
        account2.addCard("2222 2222 3333 4444");
        account2.addCard("3333 3333 4444 5555");

        client1.addAccount(account1);
        client2.addAccount(account2);

        account1.setBalance(Balance.getBalCur());
        account1.setNumber("40817111111");
        System.out.println("Баланс карт " + account1.getCardNums() + " для счета " + account1.getNumber() + " составляет: " + account1.getBalance());

    }
}
