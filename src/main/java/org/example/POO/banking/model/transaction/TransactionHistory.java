package org.example.POO.banking.model.transaction;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TransactionHistory {
    private final List<Transaction> transactions;

    public TransactionHistory() {
        this.transactions = new ArrayList<>();
    }

    public void addTransaction (Transaction transaction) {
        if (transaction == null)
            throw new IllegalArgumentException("Transaction cannot be null");
        transactions.add(transaction);
    }
    public List<Transaction> getAllTransactions () {
        return List.copyOf(transactions);
    }
    public Optional<Transaction> findByTransactionId(String transactionId) {
        return transactions.stream().filter(transaction ->
                transaction.getTransactionId().equals(transactionId)).findFirst();
    }
    public List<Transaction> getTransactionsByAccount (String accountNumber) {
        return transactions.stream().filter(transaction ->
                accountNumber.equals(transaction.getSourceAccount()) || accountNumber.equals(transaction.getDestinationAccount())).toList();
    }
}