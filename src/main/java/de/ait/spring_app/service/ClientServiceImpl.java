package de.ait.spring_app.service;

import de.ait.spring_app.model.Account;
import de.ait.spring_app.model.Client;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Component

public class ClientServiceImpl implements ClientService{

    public final AccountService accountService;

    @Override
    public List <Client> getAllClients() {
        return accountService.getAllClients().stream()
                .map(account ->account.getOwner())
                .collect(Collectors.toList());
    }

    @Override
    public Client findById(Long id) {
        return getAllClients().stream()
                .filter(client -> client.getId().equals(id))
                .findAny().
                get();
    }

    @Override
    public List<Account> getAccountsByClientId(Long clientId) {
        return accountService.getAllClients().stream()
                .filter(account -> account.getOwner().getId().equals(clientId))
                .collect(Collectors.toList());
    }
}
