/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

/**
 *
 * @author bretthanson
 */
public class BankAccount {

    // protected so that the fields are available to subclasses
    protected String ownerName;
    protected double balance;

    public BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void transfer(BankAccount destinationAccount, double amount) {
        destinationAccount.deposit(amount);
        this.balance -= amount;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Cannot deposit a negative amount");
        }
        this.balance += amount;
    }

    protected void withdraw(double amount) {
        this.balance -= amount;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public double getBalance() {
        return this.balance;
    }
}
