package de.ait.spring_app.service;

import de.ait.spring_app.model.Client;
import de.ait.spring_app.repositories.AccountRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;
@RequiredArgsConstructor
@Service
public class AccountService {
    private final AccountRepository accountRepository;

    public List<Client> getAllClients() {
        return accountRepository.findAll().stream()
                .map(account -> account.getOwner())
                .distinct()
                .collect(Collectors.toList());
    }
}
