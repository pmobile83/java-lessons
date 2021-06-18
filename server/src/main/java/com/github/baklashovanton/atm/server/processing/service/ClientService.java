package com.github.baklashovanton.atm.server.processing.service;

import com.github.baklashovanton.atm.server.common.dto.AccountDTO;
import com.github.baklashovanton.atm.server.common.dto.ClientDTO;
import com.github.baklashovanton.atm.server.processing.entity.Account;
import com.github.baklashovanton.atm.server.processing.entity.Client;
import com.github.baklashovanton.atm.server.processing.exception.ClientNotFoundException;
import com.github.baklashovanton.atm.server.processing.repository.ClientCrudRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class ClientService {
    private ClientCrudRepository clientCrudRepository;

    public ClientDTO getClient(Long id) {
        Client client = clientCrudRepository.findById(id)
                .orElseThrow(ClientNotFoundException::new);

        Set<Account> accountSet = client.getAccounts();
        List<AccountDTO> accountDTOSet = new ArrayList<>();

        for (Account account : accountSet) {

            accountDTOSet.add(new
                    AccountDTO(account.getId().intValue(),
                    account.getAccnumber(),
                    account.getBalance(),
                    account.getCurrency()));
        }

        return new ClientDTO
                (client.getId().intValue(), client.getClientnumber().intValue(), client.getLastname(), client.getFirstname(), client.getMiddlename(), accountDTOSet);
    }

    public List<ClientDTO> getAllClients() {
        Iterable<Client> clientIterable = clientCrudRepository.findAll();
        List<ClientDTO> clients = new ArrayList<>();

        clientIterable.forEach(
                client -> {
                    Set<Account> accountSet = client.getAccounts();
                    List<AccountDTO> accountDTOSet = new ArrayList<>();

                    for (Account account : accountSet) {

                        accountDTOSet.add(new AccountDTO(Math.toIntExact(account.getId()),
                                account.getAccnumber(),
                                account.getBalance(),
                                account.getCurrency()));
                    }
                    clients.add(new ClientDTO(client.getId().intValue(),
                            client.getClientnumber().intValue(), client.getLastname(), client.getFirstname(), client.getMiddlename(), accountDTOSet));
                }
        );
        return clients;
    }
}
