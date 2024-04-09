package de.ait.spring_app.repositories;

import de.ait.spring_app.model.Transaction;

import java.util.List;
import java.util.Optional;

public interface TransactionRepository {
    public List<Transaction> getTransactions();
    public Optional<Transaction> findTransactionById(Long id);

}
