package org.example.POO.banking.model.transaction;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Transaction {
    private final String transactionId;
    private final TransactionType type;
    private final BigDecimal amount;
    private final LocalDateTime timestamp;
    private final String sourceAccount;
    private final String destinationAccount;
    private final TransactionStatus status;

    public Transaction(TransactionType type, BigDecimal amount, String sourceAccount, String destinationAccount, TransactionStatus status) {
        if (type == null || amount == null || amount.compareTo(BigDecimal.ZERO) <= 0 || status == null)
            throw new IllegalArgumentException("Invalid transaction data");
        this.transactionId = UUID.randomUUID().toString();
        this.type = type;
        this.amount = amount;
        this.sourceAccount = sourceAccount;
        this.timestamp = LocalDateTime.now();
        this.destinationAccount = destinationAccount;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", type=" + type +
                ", amount=" + amount +
                ", timestamp=" + timestamp +
                ", sourceAccount='" + sourceAccount + '\'' +
                ", destinationAccount='" + destinationAccount + '\'' +
                ", status=" + status +
                '}';
    }

    public String getTransactionId() {
        return transactionId;
    }
    public TransactionType getType() {
        return type;
    }
    public BigDecimal getAmount() {
        return amount;
    }
    public LocalDateTime getTimestamp() {
        return timestamp;
    }
    public String getSourceAccount() {
        return sourceAccount;
    }
    public String getDestinationAccount() {
        return destinationAccount;
    }
    public TransactionStatus getStatus() {
        return status;
    }
}
