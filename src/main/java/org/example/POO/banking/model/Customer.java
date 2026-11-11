package org.example.POO.banking.model;

import org.example.POO.banking.model.account.BankAccount;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Customer {
    private final String customerId;
    private final String fullName;
    private final String email;
    private final LocalDate registrationDate;
    private final List<BankAccount> accounts;

    public Customer(String customerId, String fullName, String email) {
        if (customerId == null || customerId.isBlank()) throw new IllegalArgumentException("Invalid customer ID");
        if (fullName == null || fullName.isBlank()) throw new IllegalArgumentException("Invalid customer name");
        if (email == null || email.isBlank() || !email.matches("^[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?$")) throw new IllegalArgumentException("Invalid email");

        this.customerId = customerId;
        this.fullName = fullName;
        this.email = email;
        this.registrationDate = LocalDate.now();
        this.accounts = new ArrayList<>();
    }

    public void addAccount (BankAccount account) {
        Objects.requireNonNull(account, "Account cannot be null");
        /*
        if (account == null) {
           throw new NullPointerException("Account cannot be null");
        }
        */
        if (accounts.stream().anyMatch(existing -> existing.getAccountNumber().equals(account.getAccountNumber())) && account.getOwner().customerId.equals(this.customerId)) throw new IllegalArgumentException("Account belongs to another or exist the ID");
        accounts.add(account);
    }

    public BankAccount getAccount (String accountNumber) {
        return accounts.stream().filter(account -> account.getAccountNumber().equals(accountNumber)).findFirst().orElse(null);
    }

    public boolean removeAccount (String accountNumber) {
        BankAccount account = getAccount(accountNumber);
        if (account == null) return false;
        if (account.getBalance().compareTo(account.getInitialBalance()) != 0)
            throw new IllegalArgumentException("Account cannot be removed because its balance changed.");

    }
}
