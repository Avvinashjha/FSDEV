package com.dailycoder.bs;

public class SavingsAccount extends Account {
    private static final double INTEREST_RATE = 0.05; // 5%

    public SavingsAccount(String accountId, Customer customer) {
        super(accountId, customer);
    }

    @Override
    public void applyInterest() {
        balance += balance * INTEREST_RATE;
    }

    @Override
    public String getAccountType() {
        return "Savings";
    }
}
