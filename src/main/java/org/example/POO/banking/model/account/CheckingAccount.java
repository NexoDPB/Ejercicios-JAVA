package org.example.POO.banking.model.account;

import org.example.POO.banking.model.Customer;
import org.example.POO.banking.model.transaction.AccountType;
import java.math.BigDecimal;

public class CheckingAccount extends BankAccount {
    private final BigDecimal overdraftLimit;
    private final BigDecimal maintenanceFee;

    public CheckingAccount(String accountNumber, Customer owner, BigDecimal initialBalance, BigDecimal overdraftLimit, BigDecimal maintenanceFee) {
        super(accountNumber, owner, initialBalance);
        validateNonNegative(overdraftLimit);
        validateNonNegative(maintenanceFee);
        this.overdraftLimit = overdraftLimit;
        this.maintenanceFee = maintenanceFee;
    }
    @Override
    public boolean canWithdraw(BigDecimal amount) {
        if (amount == null || amount.compareTo(BigDecimal.ZERO) <= 0)
            return false;
        BigDecimal resultingBalance = getBalance().subtract(amount);
        return resultingBalance.compareTo(overdraftLimit.negate()) >= 0;
    }
    public BigDecimal getAvailableBalance() {
        return getBalance().add(overdraftLimit);
    }
    public void applyMaintenanceFee() {
        if (maintenanceFee.compareTo(BigDecimal.ZERO) == 0) return;
        withdraw(maintenanceFee);
    }
    @Override
    public AccountType getAccountType() {
        return AccountType.CHECKING;
    }
    public BigDecimal getMaintenanceFee() {
        return maintenanceFee;
    }
    public BigDecimal getOverdraftLimit() {
        return overdraftLimit;
    }
}