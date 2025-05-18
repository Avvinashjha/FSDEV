package com.dailycoder.bs;

public class CurrentAccount extends Account {

    public CurrentAccount(String accountId, Customer customer) {
        super(accountId, customer);
    }

    @Override
    public void applyInterest() {
        // No interest for current account
    }

    @Override
    public String getAccountType() {
        return "Current";
    }
}
