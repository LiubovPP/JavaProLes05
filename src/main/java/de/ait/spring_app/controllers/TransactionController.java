package de.ait.spring_app.controllers;

import de.ait.spring_app.model.Transaction;
import de.ait.spring_app.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor

public class TransactionController {
   public final TransactionService transactionService;
//GET /transactions - все транзакции
//GET /transactions/1 - транзакция c заданным id
@GetMapping("/transactions")
public List<Transaction> getTransactions() {

return transactionService.getTransactions();
    }
    @GetMapping("/transactions/{id}")
    public Transaction getTransactions(@PathVariable Long id) {

        return transactionService.findTransactionById(id);
    }
}
