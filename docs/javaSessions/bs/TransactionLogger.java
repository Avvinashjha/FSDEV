package com.dailycoder.bs;

import java.util.ArrayList;
import java.util.List;

// Single Responsibility Principle: Only responsible for logging
public class TransactionLogger {
    private List<Transaction> transactions = new ArrayList<>();

    public void logTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void printAllTransactions() {
        System.out.println("=== Transaction History ===");
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}
