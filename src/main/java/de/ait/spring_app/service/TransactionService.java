package de.ait.spring_app.service;

import de.ait.spring_app.model.Account;
import de.ait.spring_app.model.Transaction;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface TransactionService {
   public List <Transaction> getTransactions();
public Transaction findTransactionById(Long id);

   List<Transaction> getTransactionsByAccount(String accountIBAN);
}
