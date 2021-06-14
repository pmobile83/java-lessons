package com.github.baklashovanton.atm.server.common.dto;

import lombok.Value;

import java.util.List;

@Value
public class ClientDTO {
    private final int clientid;
    private final int clientnumber;
    private final String lastname;
    private final String firstname;
    private final String middlename;
    private final List<AccountDTO> accountDTO;
}
