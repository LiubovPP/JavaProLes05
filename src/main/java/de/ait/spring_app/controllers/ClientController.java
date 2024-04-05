package de.ait.spring_app.controllers;


import de.ait.spring_app.model.Client;
import de.ait.spring_app.service.AccountService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequiredArgsConstructor
@RestController
public class ClientController {
    private final AccountService accountService;
    @GetMapping("/client")
    public Client getClient () {
        return new Client (12L, "firstClient", "email");
    }
    @GetMapping ("/allclients")
    public List<Client> getAllClients() {
        return accountService.getAllClients();
    }
}
