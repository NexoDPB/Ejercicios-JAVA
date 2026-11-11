package org.example.POO.banking.model.transaction;

import java.time.LocalDateTime;

public class Transaction {
    private String transactionId;
    private TransactionType type;
    private double amount;
    private LocalDateTime timestamp;
}
