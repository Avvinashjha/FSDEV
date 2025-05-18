package com.dailycoder.bs;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Customer> customers = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Customer findCustomerById(String id) {
        for (Customer c : customers) {
            if (c.getCustomerId().equals(id)) {
                return c;
            }
        }
        return null;
    }

    public void printAllCustomers() {
        for (Customer c : customers) {
            System.out.println("Customer: " + c.getName() + " (ID: " + c.getCustomerId() + ")");
            for (Account a : c.getAccounts()) {
                System.out.println(" - Account ID: " + a.getAccountId() + " | Type: " + a.getAccountType() + " | Balance: $" + a.getBalance());
            }
        }
    }
}
