package de.ait.spring_app.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class Transaction {
    private Long id;
    private Account debit;
    private Account credit;
    private double amount;
}
