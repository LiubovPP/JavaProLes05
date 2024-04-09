package de.ait.spring_app.service;

import de.ait.spring_app.model.Account;
import de.ait.spring_app.model.Transaction;
import de.ait.spring_app.repositories.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TransactionServiceImpl implements TransactionService{
    private final TransactionRepository transactionRepository;
    @Override
    public List<Transaction> getTransactions() {
        return transactionRepository.getTransactions();
    }

    @Override
    public Transaction findTransactionById(Long id) {
        return transactionRepository.findTransactionById(id).get();
    }

    @Override
    public List<Transaction> getTransactionsByAccount(String accountIBAN) {
        List <Transaction> all=getTransactions();
        return all.stream().filter(transaction -> isTransactionWithDebitAccount(accountIBAN,transaction))
                .collect(Collectors.toList());
    }

    private boolean isTransactionWithDebitAccount(String accountIBAN, Transaction transaction) {
       return  transaction.getDebit().getIban().equals(accountIBAN)|| transaction.getCredit().getIban().equals(accountIBAN);
    }
}
