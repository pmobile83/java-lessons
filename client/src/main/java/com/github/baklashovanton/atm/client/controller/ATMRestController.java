package com.github.baklashovanton.atm.client.controller;

import com.github.baklashovanton.atm.client.exception.ATMInternalErrorException;
import com.github.baklashovanton.atm.client.service.ATMService;
import com.github.baklashovanton.atm.server.common.messages.Request;
import com.github.baklashovanton.atm.server.common.messages.RequestTypes;
import lombok.AllArgsConstructor;
import lombok.extern.java.Log;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@AllArgsConstructor
@Log
public class ATMRestController {
    private ATMService atmService;

    @GetMapping("/error")
    public String getATMsStatus() {
        return "ERROR";
    }

    @GetMapping("/ATMs/{ATMId}/clients/{clientId}/accounts/{accountId}/{PIN}")
    public ResponseEntity<String> getClientBalance(
            @PathVariable("ATMId") Long ATMId,
            @PathVariable("clientId") Long clientId,
            @PathVariable("accountId") Long accountId,
            @PathVariable("PIN") int PIN) {

        log.info("clientId " + clientId + " accountId " + accountId + " PIN " + PIN);

        if (ATMId != 1) {
            throw new ATMInternalErrorException("ATM internal Error");
        }

        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<Request> request = new HttpEntity<>(new Request(1, "{\"clientId\":1,\"accountId\":0,\"pin\":1111}", RequestTypes.JSON));

        log.info("request.toString()" + request.toString());
        ResponseEntity<String> responseEntityStr = restTemplate.
                postForEntity("http://127.0.0.1:8080/hosts/1/clients/" + clientId,
                        request, String.class);
        log.info("responseEntityStr.getBody()" + responseEntityStr.getBody());
        return responseEntityStr;
    }
}
