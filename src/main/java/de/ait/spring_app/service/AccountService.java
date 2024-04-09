package de.ait.spring_app.service;
import de.ait.spring_app.model.Account;
import de.ait.spring_app.model.Client;
import java.util.List;

public interface AccountService {


    public List<Account> getAllClients();

    Account getAccountById(Long accountId);
}
