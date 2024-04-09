package de.ait.spring_app.repositories;

import de.ait.spring_app.model.Account;
import de.ait.spring_app.model.Client;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class AccountsListCrudRepository implements AccountRepository{
    private List<Account> accounts = List.of(
            new Account(1L,"DE0001",1000, new Client(1L,"Jack", "jack@mail.com")),
            new Account(2L,"DE0002",5000, new Client(2L,"Jack1", "jack1@mail.com")),
            new Account(5L,"DE0006",1215000, new Client(2L,"Jack1", "jack1@mail.com")),

            new Account(3L,"DE0003",3000.10, new Client(3L,"Jack2", "jack2@mail.com")),
            new Account(4L,"DE0004",100, new Client(4L,"Jack3", "jack3@mail.com"))
    );


    @Override
    public List<Account> findAll() {
        return accounts;
    }

    @Override
    public Optional<Account> findById(Long accountId) {
        return accounts.stream().filter(account -> account.getId().equals(accountId)).findAny();
    }
}
