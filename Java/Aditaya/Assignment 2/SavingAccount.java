/* 
Sub class for Saving Accounts inheriting data from Parent class Account 
It has attributes to store interest rate, interest accrued and interest paid.
It has a constructor to initialize these values,
and methods to get the values of these attributes and add interest in the account.

Author: Aditaya Samui
Date: 23-06-2025
*/

class SavingAccount extends Account {
    public float interest_rate;                 //Stores the percentage a bank pays over time
    public double interest_accrued;             //Stores interest that has been earned but not paid yet
    public double interest_paid;                //Stores total interest that has been paid

    //Constructor
    SavingAccount(String account_no, double account_balance, float interest_rate) {
        super(account_no, account_balance);
        this.interest_rate=interest_rate;
        interest_accrued=0.0;
        interest_paid=0.0;
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
        interest_accrued=account_balance*interest_rate/100;
        account_balance+=interest_accrued;
        interest_paid+=interest_accrued;
    }
    
}
