package com.dailycoder.bs;

public class Main {
    public static void main(String[] args) {
        TransactionLogger logger = new TransactionLogger();
        Bank bank = new Bank();

        // Create customer
        Customer alice = new Customer("C1001", "Alice Johnson");

        // Create accounts using factory
        Account savings = AccountFactory.createAccount("savings", "A1001", alice);
        Account current = AccountFactory.createAccount("current", "A1002", alice);

        // Add accounts to customer
        alice.addAccount(savings);
        alice.addAccount(current);

        // Add customer to bank
        bank.addCustomer(alice);

        // Perform operations
        savings.deposit(1000, logger);
        savings.applyInterest(); // Apply interest on savings
        savings.withdraw(200, logger);

        current.deposit(5000, logger);
        current.withdraw(1000, logger);

        // Print customer details
        bank.printAllCustomers();

        // Print transaction logs
        logger.printAllTransactions();
    }
}
