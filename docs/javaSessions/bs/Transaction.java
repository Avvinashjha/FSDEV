package com.dailycoder.bs;
public class Transaction {
    private String accountId;
    private String type; // deposit, withdrawal
    private double amount;

    public Transaction(String accountId, String type, double amount) {
        this.accountId = accountId;
        this.type = type;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "accountId='" + accountId + '\'' +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                '}';
    }
}
