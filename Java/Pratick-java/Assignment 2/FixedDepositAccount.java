/* 
 Sub class for Fixed Deposit Accounts inheriting data from Parent class Account.
 It has attributes to store interest rate, interest accrued, interest paid, 
 tenure period, maturity date, and interest payment frequency.
 It has a constructor to initialize these values,
 and methods to calculate interest and maturity amount.

 Author: Pratick Dam
 Date: 10-07-2025
*/

import java.util.Date;

// Represents a fixed deposit account
public class FixedDepositAccount extends Account {
    private float interest_rate;
    private double interest_accrued;
    private double interest_paid;
    private int tenure_time_in_days;
    private Date maturity_date;
    private int payment_frequency;

    // Constructor
    public FixedDepositAccount(String accNo, double balance, float interest_rate,
                               int tenure_time_in_days, Date maturity_date, int payment_frequency) {
        super(accNo, balance);
        this.interest_rate = interest_rate;
        this.interest_accrued = 0;
        this.interest_paid = 0;
        this.tenure_time_in_days = tenure_time_in_days;
        this.maturity_date = maturity_date;
        this.payment_frequency = payment_frequency;
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

    // Calculates and adds interest (does not modify balance)
    public void addInterest() {
        interest_accrued = (getAccountBalance() * interest_rate) / 100;
        interest_paid += interest_accrued;
    }

    // Calculates maturity amount
    public double getMaturityAmount() {
        return (getAccountBalance() + interest_paid);
    }
}
