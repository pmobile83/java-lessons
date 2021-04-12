package com.github.baklashovanton.atm.server;

import com.github.baklashovanton.atm.client.Client;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ProcessingSystem {
    private List<Client> clients = new ArrayList<>();

    public void addClient(Client client) {
        clients.add(client);
    }
}
