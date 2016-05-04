package com.acumensolutions.bank;

import account.BankAccount;
import account.CheckingAccount;
import account.SavingsAccount;

public class AcumenBank {

    public static void main(String[] args) {
        System.out.println("Welcome to Acumen Bank!");
        System.out.println();

        CheckingAccount michaelsCheckingAccount = new CheckingAccount("Michael Checking", 5000);
        CheckingAccount gobsCheckingAccount = new CheckingAccount("Gob Checking", 2000);

        System.out.println("Open Checking Accounts:");
        System.out.println();
        printAccountDetails(michaelsCheckingAccount);
        System.out.println();
        printAccountDetails(gobsCheckingAccount);
        System.out.println();

        System.out.println("==============================================================");
        System.out.println("Making transfer of $1000...(" + michaelsCheckingAccount.getOwnerName() + " to " + gobsCheckingAccount.getOwnerName()+ ")");
        System.out.println("==============================================================");
        System.out.println();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            return;
        }

        michaelsCheckingAccount.transfer(michaelsCheckingAccount, gobsCheckingAccount, 1000);

        System.out.println("Updated Checking Account Details:");
        System.out.println();
        printAccountDetails(michaelsCheckingAccount);
        System.out.println();
        printAccountDetails(gobsCheckingAccount);
        System.out.println();
        
        SavingsAccount acesSavingsAccount = new SavingsAccount("Ace's Savings", 30000, .0089);
        SavingsAccount garysSavingsAccount = new SavingsAccount("Gary's Savings", 10000, .0056);

        System.out.println("------------------------------------------------------------------------");
        System.out.println("Open Savings Accounts:");
        System.out.println();
        printAccountDetails(acesSavingsAccount);
        System.out.println();
        printAccountDetails(garysSavingsAccount);
        System.out.println();

        System.out.println("==============================================================");
        System.out.println("Making transfer of $5000...(" + acesSavingsAccount.getOwnerName() + " to " + garysSavingsAccount.getOwnerName() + ")");
        System.out.println("==============================================================");
        System.out.println();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            return;
        }

        acesSavingsAccount.transfer(acesSavingsAccount, garysSavingsAccount, 5000);
        
        acesSavingsAccount.ApplyInterestRate(2);
        garysSavingsAccount.ApplyInterestRate(2);

        System.out.println("Updated SavingsAccount Details:");
        System.out.println();
        printSavingsAccountDetails(acesSavingsAccount);
        System.out.println();
        printSavingsAccountDetails(garysSavingsAccount);

    }

    private static void printAccountDetails(BankAccount account) {

        System.out.format("Account for %s:\r\n", account.getOwnerName());
        System.out.format("Balance: $%.2f\r\n", account.getBalance());

    }

    private static void printSavingsAccountDetails(SavingsAccount savingsAccount) {
        System.out.format("Account for %s:\r\n", savingsAccount.getOwnerName());
        System.out.format("Balance: $%.2f\r\n", savingsAccount.getEndPrincipal());
    }

}

// sample code for savings account implementation
        /*
		// Initialize new savings account with initial balance of $30,000 and 0.89% interest
		SavingsAccount acesSavingsAccount = new SavingsAccount("Ace", 30000, .0089);
		
		SavingsAccount garysSavingsAccount = new SavingsAccount("Gary", 10000, .0056);
		
		acesSavingsAccount.transfer(garysSavingsAccount, 5000);
		// apply 2 years of interest to the savings accounts
		acesSavingsAccount.applyInterest(2);
		garysSavingsAccount.applyInterest(2);
         */
