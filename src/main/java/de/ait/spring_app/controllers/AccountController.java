package de.ait.spring_app.controllers;

import de.ait.spring_app.model.Account;
import de.ait.spring_app.model.Client;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
@AllArgsConstructor
public class AccountController {

@GetMapping ("/accounts")
    public List<Account> getAccounts (){
    List<Account> accounts = new ArrayList<>();
    // Добавляем несколько тестовых счетов
    accounts.add(new Account(1L, "123456789", 1000.0, new Client(1L, "John Doe", "john@example.com")));
    accounts.add(new Account(2L, "987654321", 500.0, new Client(2L, "Jane Doe", "jane@example.com")));
    return accounts;
}

}
