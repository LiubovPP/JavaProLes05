package de.ait.spring_app.service;

import de.ait.spring_app.model.Account;
import de.ait.spring_app.model.Client;

import java.util.List;

public interface ClientService {
    List<Client> getAllClients();

    Client findById(Long id);

    List<Account> getAccountsByClientId(Long clientId);
}
