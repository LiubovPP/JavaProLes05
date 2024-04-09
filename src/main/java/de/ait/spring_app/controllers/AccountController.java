package de.ait.spring_app.controllers;

import de.ait.spring_app.model.Account;
import de.ait.spring_app.model.Client;
import de.ait.spring_app.model.Transaction;
import de.ait.spring_app.service.AccountService;
import de.ait.spring_app.service.TransactionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
@AllArgsConstructor
public class AccountController {
 private final AccountService service;
 private final TransactionService transactionService;

//  private List<Account> accounts = new ArrayList<>();

@GetMapping ("/accounts")
    public List<Account> getAccounts (){

    // Добавляем несколько тестовых счетов
  //  accounts.add(new Account(1L, "123456789", 1000.0, new Client(1L, "John Doe", "john@example.com")));
   // accounts.add(new Account(2L, "987654321", 500.0, new Client(2L, "Jane Doe", "jane@example.com")));
    return service.getAllClients();
}
@GetMapping ("/accounts/{accountId}")
public Account getAccountById(@PathVariable Long accountId){
    return service.getAccountById (accountId);
}

@GetMapping("/accounts/{accountIBAN}/transactions")
    public List<Transaction> getAllTransactionsByAccount(@PathVariable String accountIBAN){
    return transactionService.getTransactionsByAccount(accountIBAN);
}

}
