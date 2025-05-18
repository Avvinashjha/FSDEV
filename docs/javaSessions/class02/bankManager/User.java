package com.dailycoder.class02.bankManager;

public class User {
    String username;
    public String password;
    public String accountNumber;
    public String phoneNumber;
    public int accountBalance;

    public void getUserDetails(){
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Account Balance: " + accountBalance);
    }
}
