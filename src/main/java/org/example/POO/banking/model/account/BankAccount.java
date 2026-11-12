package org.example.POO.banking.model.account;

import org.example.POO.banking.model.Customer;
import org.example.POO.banking.model.transaction.AccountType;
import java.math.BigDecimal;
import java.util.Objects;

public abstract class BankAccount {
    private final String accountNumber;
    private final Customer owner;
    private final BigDecimal initialBalance;
    private BigDecimal balance;

    protected BankAccount (String accountNumber, Customer owner, BigDecimal initialBalance) {
        if (accountNumber == null || accountNumber.isBlank()) throw new IllegalArgumentException("Invalid account number");
        this.accountNumber = accountNumber;
        this.owner = Objects.requireNonNull(owner);
        this.initialBalance = Objects.requireNonNull(initialBalance);
        validateNonNegative(initialBalance);
        this.balance = initialBalance;
    }
    public void deposit (BigDecimal amount) {
        validatePositive(amount);
        balance = balance.add(amount);
    }
    public boolean withdraw (BigDecimal amount) {
        validatePositive(amount);
        if (!canWithdraw(amount)) return false;
        balance = balance.subtract(amount);
        return true;
    }
    public abstract boolean canWithdraw (BigDecimal amount);
    public abstract AccountType getAccountType();
    protected void validateNonNegative (BigDecimal amount) {
        if (amount == null || amount.compareTo(BigDecimal.ZERO) < 0)
            throw new IllegalArgumentException("Amount must be positive");
    }
    protected void validatePositive (BigDecimal amount) {
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0)
            throw new IllegalArgumentException("Amount cannot be positive");
    }

    public String getAccountNumber() {
        return accountNumber;
    }
    public Customer getOwner() {
        return owner;
    }
    public BigDecimal getInitialBalance() {
        return initialBalance;
    }
    public BigDecimal getBalance() {
        return balance;
    }
}
