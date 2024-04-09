package de.ait.spring_app.controllers;


import de.ait.spring_app.model.Account;
import de.ait.spring_app.model.Client;
import de.ait.spring_app.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RequiredArgsConstructor
@RestController

public class ClientController {
    private final ClientService clientService;

    @GetMapping("/client")
    public Client getClient() {
        return new Client(12L, "firstClient", "email");
    }

    @GetMapping("/allclients")
    public List<Client> getAllClients() {
        return clientService.getAllClients();
    }

    // GET localhost:8080/client/1
    @GetMapping("/client/{id}")
    public Client getAllClients(@PathVariable Long id) {
        return clientService.findById(id);
    }

    @GetMapping("/clients")
    public String postHandler() {
        return "hello";
    }
    @GetMapping("/clients/{id}/accounts")
    public List<Account> getAccountsByClientId(@PathVariable Long id) {
        return clientService.getAccountsByClientId(id);
    }
}
