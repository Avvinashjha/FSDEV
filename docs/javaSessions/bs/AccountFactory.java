package com.dailycoder.bs;
public class AccountFactory {
    public static Account createAccount(String type, String accountId, Customer customer) {
        switch (type.toLowerCase()) {
            case "savings":
                return new SavingsAccount(accountId, customer);
            case "current":
                return new CurrentAccount(accountId, customer);
            default:
                throw new IllegalArgumentException("Unknown account type: " + type);
        }
    }
}
