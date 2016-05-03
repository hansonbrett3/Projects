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
public class SavingsAccount extends BankAccount {

    private double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(String ownerName, double balance, double interestRate) {
        super(ownerName, balance);
        this.interestRate = interestRate;
    }

    public void ApplyInterestRate(double interestRate) {
        double increase = (this.getBalance() * interestRate);

    }
}
