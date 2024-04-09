package de.ait.spring_app.repositories;

import de.ait.spring_app.model.Account;
import de.ait.spring_app.model.Client;
import de.ait.spring_app.model.Transaction;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@RequiredArgsConstructor
@Component

public class TransactionRepositoryImpl implements TransactionRepository{
    List<Transaction> transactions = List.of(
            new Transaction(1L,
                    new Account(100l, "DE11001", 1000, new Client(100L, "name1", "name1@mail.com")),
                    new Account(101l, "DE11002", 8000, new Client(101L, "name2", "name2@mail.com")),
                    100
            ),
            new Transaction(2L,
                    new Account(102l, "DE11004", 1700, new Client(102L, "name3", "name3@mail.com")),
                    new Account(103l, "DE11003", 8300, new Client(103L, "name4", "name4@mail.com")),
                    1600
            ),
            new Transaction(2L,
                    new Account(102l, "DE11004", 1700, new Client(102L, "name3", "name3@mail.com")),
                    new Account(103l, "DE11003", 8300, new Client(103L, "name4", "name4@mail.com")),
                    50)
            );



    @Override
    public List<Transaction> getTransactions() {
        return transactions;
    }

    @Override
    public Optional<Transaction> findTransactionById(Long id) {
        return transactions.stream().filter(transaction -> transaction.getId().equals(id)).findAny();
    }
}
