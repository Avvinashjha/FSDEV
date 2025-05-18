package com.dailycoder.bs;

public abstract class Account {
    protected String accountId;
    protected double balance;
    protected Customer customer;

    public Account(String accountId, Customer customer) {
        this.accountId = accountId;
        this.customer = customer;
        this.balance = 0.0;
    }

    public abstract void applyInterest();

    public void deposit(double amount, TransactionLogger logger) {
        if (amount > 0) {
            balance += amount;
            logger.logTransaction(new Transaction(accountId, "deposit", amount));
        }
    }

    public boolean withdraw(double amount, TransactionLogger logger) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            logger.logTransaction(new Transaction(accountId, "withdrawal", amount));
            return true;
        }
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountId() {
        return accountId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public abstract String getAccountType();
}
