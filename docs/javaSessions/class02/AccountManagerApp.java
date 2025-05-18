package com.dailycoder.class02;

import java.util.Scanner;

/*
* Bank Account Application
*/
/*
* Integer vs int
* User
* int age; // 0
* Integer age; // null
* */
public class AccountManagerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Bank Account Application");
        int maxSize = 20;
        int accountNumber = 0;
        String [] users = new String[maxSize];
        int [] balances = new int[maxSize];
        int a = 10;

        String [] menu = {"1. Create Account", "2. Deposit", "3. Withdraw", "4. Check Balance", "5. Exit"};

        Boolean startApplication = true;
        do{
            System.out.println("Please select an option:");
            for (int i = 0; i < menu.length; i++) {
                System.out.println(menu[i]);
            }
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    if(accountNumber >= maxSize){
                        System.out.println("Maximum number of accounts reached.");
                    }else{
                        System.out.println("Enter User Name");
                        System.out.println(users[0]);
                        String name = scanner.next();
                        users[accountNumber] = name;
                        accountNumber += 1;
                    }
                    break;

//                    users[users.length-1] = name;
//                    boolean isFull = true;
//                    for(int  i = 0; i < users.length; i++){
//                        if(users[i] == null){
//                            users[i] = name;
//                            isFull = false;
//                            break;
//                        }
//                    }
//                    if(isFull){
//                        System.out.println("Account creation failed. Maximum number of accounts reached.");
//                    }else {
//                        System.out.println("Account created successfully for " + name);
//                    }
                case 2:
                    int userAccountNumber = scanner.nextInt();
                    int amount = scanner.nextInt();
                    if(userAccountNumber > maxSize -1){
                        System.out.println("Invalid Account Number.");
                    }else
                    if(users[userAccountNumber] == null){
                        System.out.println("Account does not exist.");
                    }else if(amount < 1){
                        System.out.println("Invalid amount.");
                    }else{
                        balances[accountNumber] = balances[accountNumber] + amount;
                        System.out.println("Deposit successful. New balance is " + balances[accountNumber]);
                    }
                    break;
                case 3:
                    int userAccountNumber1 = scanner.nextInt();
                    int amount1 = scanner.nextInt();
                    if(userAccountNumber1 > maxSize -1){
                        System.out.println("Invalid Account Number.");
                    }else
                    if(users[userAccountNumber1] == null){
                        System.out.println("Account does not exist.");
                    }else if(amount1 < 1){
                        System.out.println("Invalid amount.");
                    }else{
                        if(balances[accountNumber] - amount1 < 0){
                            System.out.println("Insufficient balance.");
                        }else {
                            balances[accountNumber] = balances[accountNumber] - amount1;
                            System.out.println("Deposit successful. New balance is " + balances[accountNumber]);
                        }
                    }
                    break;
                case 4:
                    int userAccountNumber2 = scanner.nextInt();
                    if(userAccountNumber2 > maxSize -1){
                        System.out.println("Invalid Account Number.");
                    }else
                    if(users[userAccountNumber2] == null){
                        System.out.println("Account does not exist.");
                    }else{
                        System.out.println("Your balance is " + balances[accountNumber]);
                    }
                    break;

                case 5:
                    System.out.println("Thank you for using the Bank Account Application. Goodbye!");
                    startApplication = false;
                    break;
            }
        }while (startApplication);
    }
}

