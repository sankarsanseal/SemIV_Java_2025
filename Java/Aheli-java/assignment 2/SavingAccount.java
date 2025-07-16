/* 
 Sub class for Saving Accounts inheriting data from Parent class Account.
 It has attributes to store interest rate, interest accrued, and interest paid.
 It has a constructor to initialize these values,
 and methods to calculate and retrieve interest-related information.

 Author: Aheli Manna
 Date: 11-07-2025
*/

// Represents a savings account
public class SavingAccount extends Account {
    private float interest_rate;
    private double interest_accrued;
    private double interest_paid;

    // Constructor
    public SavingAccount(String accNo, double balance, float interest_rate) {
        super(accNo, balance);
        this.interest_rate = interest_rate;
        this.interest_accrued = 0;
        this.interest_paid = 0;
    }

    public float getInterestRate() {
        return interest_rate;
    }

    public double getInterestAccrued() {
        return interest_accrued;
    }

    public double getInterestPaid() {
        return interest_paid;
    }

    // Calculates and adds interest to account
    public void addInterest() {
        interest_accrued = (getAccountBalance() * interest_rate) / 100;
        interest_paid += interest_accrued;
    }
}