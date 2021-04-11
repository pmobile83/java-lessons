package com.github.baklashovanton.atm.server;

import com.github.baklashovanton.atm.client.Client;

import java.util.ArrayList;
import java.util.List;

public class ProcessingSystem {
    private List<Client> clients = new ArrayList<>();

    public void addClient(Client client) {
        clients.add(client);
    }
}
