package org.example.POO.banking.model.account;

import org.example.POO.banking.model.Customer;
import org.example.POO.banking.model.transaction.AccountType;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class SavingsAccount extends BankAccount {
    private final BigDecimal interestRate;
    private final BigDecimal miniumBalance;

    public SavingsAccount(String accountNumber, Customer owner, BigDecimal initialBalance, BigDecimal interestRate, BigDecimal miniumBalance) {
        super(accountNumber, owner, initialBalance);
        if (interestRate == null || interestRate.compareTo(BigDecimal.ZERO) <= 0)
            throw new IllegalArgumentException("Invalid interest rate");
        if (miniumBalance == null || miniumBalance.compareTo(BigDecimal.ZERO) < 0 || initialBalance.compareTo(miniumBalance) < 0)
            throw new IllegalArgumentException("Invalid minimum balance");
        this.interestRate = interestRate;
        this.miniumBalance = miniumBalance;
    }

    @Override
    public boolean canWithdraw(BigDecimal amount) {
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0)
            return false;
        BigDecimal resultingBalance = getBalance().subtract(amount);
        return resultingBalance.compareTo(miniumBalance) >= 0;
    }
    public BigDecimal calculateInterest() {
        return getBalance().multiply(interestRate).setScale(2, RoundingMode.HALF_EVEN);
    }
    public void applyInterest() {
        BigDecimal interest = calculateInterest();
        if (interest.compareTo(BigDecimal.ZERO) > 0) deposit(interest);
    }
    @Override
    public AccountType getAccountType() {
        return AccountType.SAVINGS;
    }
    public BigDecimal getMiniumBalance() {
        return miniumBalance;
    }
    public BigDecimal getInterestRate() {
        return interestRate;
    }
}
