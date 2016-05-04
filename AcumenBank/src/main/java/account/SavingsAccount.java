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

    private final double interestRate;
    private double endPrincipal;

    public SavingsAccount(String ownerName, double balance, double interestRate) {
        super(ownerName, balance);
        this.interestRate = interestRate;
    }

    public void ApplyInterestRate(int yearsCompounded) {
        endPrincipal = this.getBalance() * (Math.pow((1 + interestRate), yearsCompounded));
    }

    public double getEndPrincipal() {
        return this.endPrincipal;
    }
    
    
}
