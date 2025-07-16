/* 
Sub class for Fixed Deposit Accounts inheriting data from Parent class Account 
It has attributes to store interest rate, interest accrued, interest paid, tenure time in days, 
maturity date, payment frequency, last interest paid date.
It has a constructor to initialize these values,
and methods to get the values of these attributes, add interest in the account and get maturity amount.

Author: Aditaya Samui
Date: 08-07-2025
*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class FixedDepositAccount extends Account{
    public float interest_rate;                 //Stores the percentage a bank pays over time
    public double interest_accrued;             //Stores interest that has been earned but not paid yet
    public double interest_paid;                //Stores total interest that has been paid
    public int tenure_time_in_days;             //Total duration of fixed deposit
    public LocalDate maturity_date;             //The Date at which fixed deposit terms end
    public int payment_frequency;               //Stores the payment frequency
    public LocalDate last_interest_paid_date;   //Stores the date of last paid interest

    //Constructor
    FixedDepositAccount(String account_no, double account_balance, LocalDate account_open_date, float interest_rate, 
    int tenure_time_in_days, LocalDate maturity_date, int payment_frequency) {
        super(account_no, account_balance, account_open_date);
        this.interest_rate=interest_rate;
        interest_accrued=0.0;
        interest_paid=0.0;
        this.tenure_time_in_days=tenure_time_in_days;
        this.maturity_date=maturity_date;
        this.payment_frequency=payment_frequency;
        last_interest_paid_date=null;           //No Interest has been paid yet
    }

    //Methods
    public float getInterestRate() {
        return interest_rate;
    }

    public double getInterestAccrued() {
        return interest_accrued;
    }

    public double getInterestPaid() {
        return interest_paid;
    }

    public void addInterest() {         //Method to add interest to the account
        
        // No interest if balance is zero or negative
        if (getAccountBalance() <= 0) {
            return; 
        }
        
        // Initialize if not set
        if (last_interest_paid_date == null) {
            last_interest_paid_date = getAccountOpenDate();
        }

        // Calculate the number of months since the last interest was paid
        long months = ChronoUnit.MONTHS.between(last_interest_paid_date, LocalDate.now());
        if (months > 0) {
            interest_accrued = (getAccountBalance() * interest_rate * months) / (12*100);
            interest_paid += interest_accrued;
            last_interest_paid_date = LocalDate.now();
        }
    }

    public double getMaturityAmount() {     
        account_balance+=interest_paid;
        return account_balance;  //Returns the total amount in the account after maturity

    }

}
