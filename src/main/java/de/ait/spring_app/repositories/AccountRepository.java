package de.ait.spring_app.repositories;
import de.ait.spring_app.model.Client;

import java.util.List;


public interface AccountRepository extends CrudRepository <Client> {
    public List<Client> accountsList();
}
