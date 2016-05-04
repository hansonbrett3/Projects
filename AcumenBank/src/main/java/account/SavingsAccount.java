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
    private double endPrincipal;

    public SavingsAccount(String ownerName, double balance, double interestRate) {
        super(ownerName, balance);
        this.interestRate = interestRate;
    }

    public void ApplyInterestRate(int yearsCompounded) {
        // Each savings account is compounded once annually - NewBalance = Principal(1 + InterestRate)^(YearsCompounded*compoundedPerYear)
        this.endPrincipal = this.getBalance() * (Math.pow((1 + this.getInterestRate()), yearsCompounded));
    }


    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public double getEndPrincipal() {
        return endPrincipal;
    }

    public void setEndPrincipal(double endPrincipal) {
        this.endPrincipal = endPrincipal;
    }
}
