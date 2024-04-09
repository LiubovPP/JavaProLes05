package de.ait.spring_app.service;

import de.ait.spring_app.model.Account;
import de.ait.spring_app.model.Client;
import de.ait.spring_app.repositories.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@RequiredArgsConstructor
@Component


public class AccountServiceImpl implements AccountService {
    private final AccountRepository repository;
    @Override
    public List<Account> getAllClients() {
        return repository.findAll();
    }

    @Override
    public Account getAccountById(Long accountId) {
        return repository.findById(accountId).orElse(null);
    }


}
