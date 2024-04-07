package de.ait.spring_app.repositories;

import de.ait.spring_app.model.Client;

import java.util.ArrayList;
import java.util.List;

public class AccountsListCrudRepository implements AccountRepository{
private final List <Client> clients= new ArrayList<>();

    @Override
    public List<Client> accountsList() {
        return new ArrayList<>(clients);
    }

    @Override
    public void save(Client element) {

    }

    @Override
    public List<Client> findAll() {
        return null;
    }

    @Override
    public Client findByID(Long id) {
        return null;
    }

    @Override
    public void update(Client element) {

    }

    @Override
    public void deleteByID(Long id) {

    }
}
