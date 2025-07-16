/* 
Sub class for Saving Accounts inheriting data from Parent class Account 
It has attributes to store interest rate, interest accrued, interest paid and last interest paid date.
It has a constructor to initialize these values,
and methods to get the values of these attributes and add interest in the account.

Author: Aditaya Samui
Date: 08-07-2025
*/

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class SavingAccount extends Account {
    public float interest_rate;                 //Stores the percentage a bank pays over time
    public double interest_accrued;             //Stores interest that has been earned but not paid yet
    public double interest_paid;                //Stores total interest that has been paid
    public LocalDate last_interest_paid_date;   //Stores the date of last paid interest

    //Constructor
    SavingAccount(String account_no, double account_balance, LocalDate account_open_date, float interest_rate) {
        super(account_no, account_balance, account_open_date);
        this.interest_rate=interest_rate;
        interest_accrued=0.0;
        interest_paid=0.0;
        last_interest_paid_date=null;       //No Interest has been paid yet
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
        double interest_accrued = 0.0;
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
            account_balance += interest_accrued;
            last_interest_paid_date = LocalDate.now();
        }
    }
    
}
