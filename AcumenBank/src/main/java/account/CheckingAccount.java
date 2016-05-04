package account;

public class CheckingAccount extends BankAccount {

    public CheckingAccount(String ownerName, double balance) {
        super(ownerName, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Cannot withdraw a negative amount");
        } else if ((this.balance -= amount) < 0) {
            throw new IllegalArgumentException("You have insufficient funds");
        } else {
            this.balance -= amount;
        }
    }

}
