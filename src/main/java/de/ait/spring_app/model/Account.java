package de.ait.spring_app.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Account {
    //создайте класс Account (Long id, String iban, double balance, Client owner)
    private Long id;
    private String iban;
    private double balance;
    private Client owner;
}
