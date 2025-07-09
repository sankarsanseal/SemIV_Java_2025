/* Sub class for Saving Accounts inheriting data from Parent class Account */

import java.time.LocalDate;

class SavingAccount extends Account {
    public float interest_rate;                 //Stores the percentage a bank pays over time
    public double interest_accrued;             //Stores interest that has been earned but not paid yet
    public double interest_paid;                //Stores total interest that has been paid
    public LocalDate last_interest_paid_date;   //Stores the date of last paid interest

    //Constructor
    SavingAccount(String account_no, double account_balance, float interest_rate) {
        super(account_no, account_balance, LocalDate.now());
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

    public void addInterest() {
        interest_accrued=account_balance*interest_rate/100;
        account_balance+=interest_accrued;
        last_interest_paid_date=LocalDate.now();
        interest_paid+=interest_accrued;
    }
    
}
