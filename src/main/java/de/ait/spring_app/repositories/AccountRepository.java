package de.ait.spring_app.repositories;
import de.ait.spring_app.model.Account;
import de.ait.spring_app.model.Client;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;


public interface AccountRepository {

    public List<Account> findAll();

    Optional <Account> findById(Long accountId);
}
